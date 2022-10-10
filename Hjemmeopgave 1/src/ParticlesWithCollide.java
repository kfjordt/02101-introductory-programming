import java.util.Random;

public class ParticlesWithCollide {

	public static void main(String[] args) {
		runSimulation(5,3,100);
	}
	
	public static void runSimulation (int n, int s, int t) {
		// Print out user input
		System.out.println("n=" + n + " s=" + s + " t=" + t);
		
		// Preallocate memory to two arrays which will hold the x
		// and y coordinates of the particles, respectively
		int particle_x[] = new int[2];
		int particle_y[] = new int[2];
		
		// Generate initial positions for particles and print them
		// to standard output
		for (int i = 0; i < 2; i++) {
			particle_x[i] = generateRandomInt(0, n);
			particle_y[i] = generateRandomInt(0, n);
			}
	
		// Initialize variables for collision handling
		boolean collisionFlag = false;
		boolean printFlag = true;
		int particleAmount = 2;
		
		// Start the main for loop which will run t times (i.e. the
		// amount of moves the user chose
		for (int i = 1; i <= t; i++) {
			
			// Print the move number
			System.out.print("move " + i + ", positions ");
			
			// If a collision happened in the previous move, "delete" 
			// second particle
			if (collisionFlag) {
				particleAmount = 1;
			}
			
			// Nested for loop generates new positions for each particle
			for (int p = 0; p < particleAmount; p++) {
				
				// Calculate the amount which the particle should move
				int particleMove = generateRandomInt(-s, s);
				
				// Set the new coordinates of the given coordinate
				particle_x[p] += particleMove;
				particle_y[p] += particleMove;
				
				// If the particle is about to move out of bounds, update
				// its coordinates to be within the grid
				particle_x[p] = updateOutOfBounds(particle_x[p], n);
				particle_y[p] = updateOutOfBounds(particle_y[p], n);
				
			// Print the new particle coordinates to standard output
			int particleNumString = p+1;
			System.out.print("P" + particleNumString +"=["+particle_x[p] + "," + particle_y[p] + "] ");		
			}
			
			// If a collision happened, 
			if (checkForCollision(particle_x, particle_y)) {
				collisionFlag = true;
				
				// Only print the collision alert for the first collision
				if (printFlag) {
					System.out.println();
					System.out.print("particles collide");
					printFlag = false;
				}
			}
			
			System.out.println();
		}
		
	}
	
	public static int generateRandomInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	public static int updateOutOfBounds(int pCoord, int n) {
		// If coordinate is not out of bounds, return the original coordinate
		int newCoord = pCoord;
		
		// If coordinate is above the size n of the grid, it should be updated
		// to be on the border of the grid
		if (pCoord > n) {
			newCoord = n;
		} 
		// If coordinate is below 0, it should be updated to be 0
		else if (pCoord < 0) {
			newCoord = 0;
		}
		return newCoord;
	}
	
	public static boolean checkForCollision(int[] xCoords, int[] yCoords) {
		return (xCoords[0] == xCoords[1] && yCoords[0] == yCoords[1]);
	}
	
}

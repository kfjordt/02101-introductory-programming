import java.util.Random;

public class Particles {

	public static void main(String[] args) {
		runSimulation(23,3,100);
	}
	
	public static void runSimulation (int n, int s, int t) {
		// Print out user input
		System.out.println("n=" + n + " s=" + s + " t=" + t);
		
		// Preallocate memory to two arrays which will hold the x
		// and y coordinates of the particles, respectively
		int particle_x[] = new int[3];
		int particle_y[] = new int[3];
		
		// Generate initial positions for particles and print them
		// to standard output
		for (int i = 0; i < 3; i++) {
			particle_x[i] = generateRandomInt(0, n);
			particle_y[i] = generateRandomInt(0, n);
			}
	
		
		// Start the main for loop which will run t times (i.e. the
		// amount of moves the user chose
		for (int i = 1; i <= t; i++) {
			// Print the move number
			System.out.print("move " + i + ", positions ");
			
			// Nested for loop generates new positions for each particle
			for (int p = 0; p < 3; p++) {
				
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
	
}

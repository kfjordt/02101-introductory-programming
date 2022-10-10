import java.util.Arrays;
import java.util.Random;

public class Particles2 {

	public static void main(String[] args) {
		runSimulation(10,3,2);
	}
	public static void runSimulation (int n, int s, int t) {
		System.out.println("n=" + n + " s=" + s + " t=" + t);
		
		int[][] grid = new int[n][n];
		int particle_x = generateRandomInt(0, n);
		int particle_y = generateRandomInt(0, n);
		
		for (int i = 0; i <= t; i++) {
			
			for (int p = 1; p <= 3; p++) {
				int particleMove = generateRandomInt(-s, s);
				
				particle_x += particleMove;
				particle_y += particleMove;
				
				if (particle_x >= n) {
					particle_x = n;
				} else if (particle_x < 0) {
					particle_x = 0;
				}
				
				if (particle_y >= n) {
					particle_y = n;
				} else if (particle_y < 0) {
					particle_y = 0;
				}
					
			}
		}
		int particle1_x = generateRandomInt(0, n);
		int particle1_y = generateRandomInt(0, n);
		int particle2_x = generateRandomInt(0, n);
		int particle2_y = generateRandomInt(0, n);
		int particle3_x = generateRandomInt(0, n);
		int particle3_y = generateRandomInt(0, n);
		
		grid[particle1_x][particle1_y] = 1;
		grid[particle2_x][particle2_y] = 2;
		grid[particle3_x][particle3_y] = 3;
		
		int particle1Move = generateRandomInt(-s, s);
		int particle2Move = generateRandomInt(-s, s);
		int particle3Move = generateRandomInt(-s, s);
		
		printArray(grid);
		System.out.println();
		
		grid[particle1_x][particle1_y] = 0;
		grid[particle2_x][particle2_y] = 0;
		grid[particle3_x][particle3_y] = 0;
		
		particle1_x += particle1Move;
		particle1_y += particle1Move;
		particle2_x += particle2Move;
		particle2_y += particle2Move;
		particle3_x += particle3Move;
		particle3_y += particle3Move;
		
		
		
		grid[particle1_x][particle1_y] = 1;
		grid[particle2_x][particle2_y] = 2;
		grid[particle3_x][particle3_y] = 3;
		
		printArray(grid);
	}
	
	public static int generateRandomInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	public static void printArray(int[][] grid) {
		for (int[] i : grid) {
			System.out.println(Arrays.toString(i));
		}
	}
}

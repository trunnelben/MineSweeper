3package lab3;
import cse131.ArgsProcessor;
public class MineSweeper {
	public static void main (String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		boolean mines[][] = new boolean[cols+2][rows+2];
		for (int N = 1; N<=rows; ++N){
			for(int M = 1; M<=cols; ++M){
				if ((double) Math.random() < percent){
					mines[M][N] = true;
					System.out.print("* ");
				}
				else {
					System.out.print(". ");
				}
			}
			System.out.println("");
		}
		System.out.println();
		for (int N=1; N<=rows; ++N){
			for (int M=1; M<=cols; ++M){
				int scan = 0;
				if (mines[M][N]){
					System.out.print("* ");
				}
				else{
					if (mines[M-1][N-1]){
						scan++;
					}
					if (mines[M-1][N]){
						scan++;
					}
					if (mines[M-1][N+1]){
						scan++;
					}
					if (mines[M][N-1]){
						scan++;
					}
					if (mines[M][N+1]){
						scan++;
					}
					if (mines[M+1][N-1]){
						scan++;
					}
					if (mines[M+1][N]){
						scan++;
					}
					if (mines[M+1][N+1]){
						scan++;
					}
					System.out.print(scan+" ");
				}
			}
			System.out.println();
		}
	}
}

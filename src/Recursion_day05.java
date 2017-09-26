
public class Recursion_day05 {
	public static final int N = 8;
	public static final int COUNTED = 2;
	public static int pixel[][] = {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1}
	};

	public static void main(String[] args) {
		System.out.println(countingCells(6,4));
	}
	
	public static int countingCells(int x, int y) {
		if(x < 0 || y <0 || x > N - 1 || y > N -1) {
			return 0;
		}else if(pixel[x][y] != 1) {
			return 0;
		}else {
			pixel[x][y] = COUNTED;
			return 1 + countingCells(x, y+1) + countingCells(x+1, y+1) + 
					countingCells(x+1, y) + countingCells(x+1, y-1) + 
					countingCells(x, y-1) + countingCells(x-1, y-1) + 
					countingCells(x-1, y) + countingCells(x-1, y+1);
		}
	}
}

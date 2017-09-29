
public class Recursion_day06 {
	public static final int N = 8;
	public static int cols[] = new int[N + 1];
	public static void main(String[] args) {
		queens(0);
		System.out.println("hi");
	}
	public static boolean queens(int level) {
		if(!promising(level)) {
			return false;
		}else if(level==N) {
			System.out.println("d");
			for(int i=1; i<=N; i++) {
				System.out.println("(" + i + "," + cols[i] + ")");
			}
			return true;
		}else {
			for(int i=1; i<=N; i++) {
				cols[level + 1] = i;
				System.out.println(i + ":" + cols[level + 1]);
				if(queens(level + 1)) {
					return true;
				}
			}
			return false;
		}
	}
	public static boolean promising(int level) {
		for(int i=1; i<level; i++) {
			if(cols[level] == cols[i]) {
				return false;
			}else if(level-i == Math.abs(cols[level] - cols[i])) {
				return false;
			}
		}
		return true;
	}
}

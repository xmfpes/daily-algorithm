
public class Recursion_day01 {
	public static void main(String[] args) {	
		int gcb;
		gcb  = gcb(18, 12);
		System.out.println(gcb);
	}	
	public static int gcb(int a, int b) {
		//a와 b를 나눈 나머지가 0이라
		if(a%b == 0) {
			return b;
		}else {
			return gcb(b, a%b);
		}
	}
	public static int factorial(int n) {
		if(n <= 1) {
			return n;
		}else {
			return n * factorial(n-1);
		}
	}
	public static int fibonacchi(int n) {
		//1번째 항은 1, 2번째 항 (n-1)(1) + (n-2)(0)
		if(n < 2) {
			return n;
		}else {
			return fibonacchi(n-1) + fibonacchi(n-2);
		}
	}
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n + sum(n-1);
		}
	}
}

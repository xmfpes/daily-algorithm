import java.util.Scanner;

public class Recursion_day02 {
	public static void main(String[] args) {
		String str = "1234567";
		printStr(str);
		System.out.println();
		reversePrintStr(str);
		System.out.println();
		int n = 4;
		binary(n);
		System.out.println();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arraySum(10, arr));
		System.out.println();
		int inputArr[] = new int[10];
		inputArray(10, inputArr, new Scanner(System.in));
		for(int i=0; i<10; i++) {
			System.out.println(inputArr[i]);
		}
	}
	public static void printStr(String str) {
		if(str.length() == 0) {
			return;
		}else {
			System.out.print(str.charAt(0));
			printStr(str.substring(1));
		}
	}
	public static void reversePrintStr(String str) {
		if(str.length() == 0) {
			return;
		}else {
			reversePrintStr(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	public static void binary(int n) {
		if(n < 2) {
			System.out.print(n);
		}else {
			binary(n/2);
			System.out.print(n%2);
			
		}
	}
	public static int arraySum(int n, int arr[]) {
		if(n < 1) {
			return 0;
		}else {
			return arraySum(n-1, arr) + arr[n-1];
		}
	}
	public static void inputArray(int n, int data[], Scanner input) {
		if(n==0) {
			return;
		}else {
			inputArray(n-1, data, input);
			data[n-1] = input.nextInt();
		}
	}
}

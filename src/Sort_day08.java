
public class Sort_day08 {
	public static void main(String[] args) {
		int arr1[] = {5,6,1,2,3,8};
		int arr2[] = {5,6,1,2,3,8};
		int arr3[] = {5,6,1,2,3,8};
		selectionSort(arr1);
		printArray(arr1);
		bubbleSort(arr2);
		printArray(arr2);
		insertionSort(arr3);
		printArray(arr3);
	}
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j=i-1;
			while(j >= 0 && temp < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void bubbleSort(int arr[]) {
		for(int i=arr.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

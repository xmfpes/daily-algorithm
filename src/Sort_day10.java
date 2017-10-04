
public class Sort_day10 {
	public static void main(String[] args) {
		int arr[] = {5,2,1,7,112,42,52,62};
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	public static void quickSort(int arr[], int l, int r) {
		if(l<=r) {
			int pivot = partition(arr, l, r);
			quickSort(arr, l, pivot - 1);
			quickSort(arr, pivot + 1, r);
		}
	}
	public static int partition(int arr[], int l, int r) {
		int i = l - 1;
		int pivot = arr[r];
		for(int j=l; j<r; j++) {
			if(arr[j] < pivot) {
				int temp = arr[++i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		
		return i+1;
	}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}
}

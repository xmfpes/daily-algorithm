
public class Sort_day11 {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
		heapSort(arr);
		printArray(arr);
	}

	private static void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length - 1;
		maxHeapBuild(arr);
		for (int i = length; i >= 1; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			length-=1;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapBuild(int[] arr) {
		int length = arr.length;
		// 마지막 노드의 부모 노드에서부터 시작
		for (int i = length / 2; i >= 0; i--) {
			maxHeapify(arr, i);
		}
	}

	private static void maxHeapify(int[] arr, int i) {
		if (arr.length < i * 2 + 1) {
			return;
		}
		int k = 0;
		if (arr[i * 2] > arr[i * 2 + 1]) {
			k = i * 2;
		} else {
			k = i * 2 + 1;
		}
		if (arr[i] >= arr[k]) {
			return;
		}
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[k];
		arr[k] = temp;
		maxHeapify(arr, k);
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

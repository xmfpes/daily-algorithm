
public class Sort_day09 {
	public static void main(String[] args) {
		int arr[] = {6,3,3,7,1,21,3,7,2,25};
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	public static void mergeSort(int arr[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	public static void merge(int arr[], int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=r) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=r)
			temp[k++] = arr[j++];
		for(int index=l; index<k; index++)
			arr[index] = temp[index];
	}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}
}

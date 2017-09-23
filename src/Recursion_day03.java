
public class Recursion_day03 {
	public static void main(String[] args) {
		int arr[] = { 7, 15, 3, 4, 5, 6, 27, 8, 9 };
		System.out.println(sequentialSort2(arr, 8, 5));
		System.out.println(sequentialSort3(arr, 0, 10, 5));
		System.out.println(findMax(arr, 0, 8));
		String sortedList[] = {"1","2","3","4","5","6","7"};
		System.out.println(binarySearch(sortedList, 0, sortedList.length, "4"));
	}

	public static int sequentialSort1(int arr[], int begin, int target) {
		if (begin > arr.length - 1) {
			return -1;
		} else if (arr[begin] == target) {
			return begin;
		} else {
			return sequentialSort1(arr, begin + 1, target);
		}
	}

	public static int sequentialSort2(int arr[], int end, int target) {
		if (0 > end) {
			return -1;
		} else if (arr[end] == target) {
			return end;
		} else {
			return sequentialSort2(arr, end - 1, target);
		}
	}

	public static int sequentialSort3(int arr[], int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			if (arr[middle] == target) {
				return end;
			}
			int index = sequentialSort3(arr, begin, middle - 1, target);
			if (index != -1) {
				return index;
			}else {
				return sequentialSort3(arr, middle + 1, end, target);
			}
		}
	}
	
	public static int findMax(int arr[], int begin, int end) {
		if(begin == end) {
			return arr[begin];
		}else {
			return Math.max(arr[begin], findMax(arr, begin + 1, end));
		}
	}
	
	public static int binarySearch(String items[], int begin, int end, String target) {
		if(begin > end) {
			return -1;
		}else {
			int middle = (begin + end) / 2;
			int compareResult = items[middle].compareTo(target);
			if(compareResult == 0) {
				return middle;
			}else if(compareResult > 0) {
				return binarySearch(items, middle + 1, end, target);
			}else {
				return binarySearch(items, begin, middle - 1, target);
			}
		}
	}
}

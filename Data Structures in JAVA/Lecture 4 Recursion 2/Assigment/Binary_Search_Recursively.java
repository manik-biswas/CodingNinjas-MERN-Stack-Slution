public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		int si = 0;
		int ei = input.length - 1;
		int mid = (si + ei) / 2;
		return binarySearch(input, si, ei, mid, element);
	}

	public static int binarySearch(int[] input, int si, int ei, int mid, int element) {
		if (si > ei) {
			return -1;
		}
		mid = (si + ei) / 2;
		if (input[mid] == element) {
			return mid;
		}
		if (input[mid] > element) {
			ei = mid - 1;
			return binarySearch(input, si, ei, mid, element);
		} else {
			si = mid + 1;
			return binarySearch(input, si, ei, mid, element);
		}
	}
}

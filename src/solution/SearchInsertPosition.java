package solution;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(insertPosition(nums, target));

	}

	static int insertPosition(int[] arr, int target) {
		int start = 0;
		int max = arr.length - 1;
		int mid = (start + max) / 2;
		if (target < arr[start]) {
			return start;
		}
		if (target > arr[max]) {
			return max + 1;
		}

		while (start <= max) {
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				max = mid - 1;

			}

			mid = (start + max) / 2;

		}

		return mid + 1;
	}

}

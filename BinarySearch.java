class BinarySearch {

	public static int search(int[] data, int target) {
		int head = 0, tail = data.length-1;

		while(head <= tail) {
			int mid = head + (tail-head) / 2;
			if(data[mid] == target)
				return mid;
			else if(data[mid] < target)
				head = mid + 1;
			else
				tail = mid - 1;
		}

		return -1;
	}
}
public class Test {

	public static void main(String[] args) {
		int[] data = new int[]{1,2,3,4,5,7,16,34,67,90,124,156,378,2355};

		
		int bsIndex = BinarySearch.search(data, 2355);
		int lsIndex = LinearSearch.search(data, 2355);
		System.out.println(bsIndex == lsIndex);
	}
}
 
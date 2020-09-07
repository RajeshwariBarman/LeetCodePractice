
public class LargestSumContiguousSubarraySlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		// int[] arr = {-2, -3, -4, -1, -2, -1, -9};

		// int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 };
		int max = Integer.MIN_VALUE;
		int windowstart = 0;
		int currentmax = 0;
		for (int windowend = 0; windowend < arr.length; windowend++) {
			currentmax = currentmax + arr[windowend];
			System.out.println("current max = " + currentmax);
			if (currentmax >= max)
				max = currentmax;
			else {
				currentmax = currentmax - arr[windowstart];
				System.out.println("current max1 = " + currentmax);
				windowstart++;
			}
		}

		// this is when find the length of the longest sub array wit consecutive
		// 1's
		// for (int windowend = 0; windowend < arr.length; windowend++) {
		// if (arr[windowend] != 0) {
		// currentmax = currentmax + arr[windowend];
		// if (currentmax > max)
		// max = currentmax;
		// } else
		// currentmax = 0;
		// }
		System.out.println(max);
	}

}

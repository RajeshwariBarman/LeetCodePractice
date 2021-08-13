
public class SumofAbsoluteDifferencesinaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 4, 6, 8, 10 };
		int n = nums.length;
		int[] res = new int[n];

		for (int i = 1; i < n; i++)
			nums[i] = nums[i - 1] + nums[i];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				res[i] = (nums[n - 1] - nums[0]) - (nums[0] * (n - 1));
			} else {
				int rem = nums[i] - nums[i - 1];
				res[i] = (rem * i - nums[i - 1]) + (nums[n - 1] - nums[i] - rem * (n - 1 - i));
			}

		}

		for (int i = 0; i < nums.length; i++)
			System.out.println(res[i]);

	}

}

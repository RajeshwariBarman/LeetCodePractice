
public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums = {2,3,1,2,4,3};
		int[] nums = { 1, 2, 3, 4, 5 };
		int target = 11;
		int end = 0, start = 0, sum = 0;
		int minlen = Integer.MAX_VALUE;

		for (; end < nums.length;) {
			sum = sum + nums[end];
			if (sum >= target) {
				while (sum >= target) {
					minlen = Math.min(minlen, end - start + 1);
					sum = sum - nums[start];
					start++;
				}
				end++;

			} else {
				end++;
			}
		}

		minlen = (minlen != Integer.MAX_VALUE) ? minlen : 0;
		System.out.println(minlen);

	}

}

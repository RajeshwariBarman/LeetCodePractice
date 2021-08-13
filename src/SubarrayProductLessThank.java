
public class SubarrayProductLessThank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		int start = 0, end = 0;
		int count = 0;
		int product = 1;
		for (end = 0; end < nums.length; end++) {
			product = product * nums[end];
			while (product >= k && start<=end) {
				product = product / nums[start];
				start++;
			}
			count = count + end - start + 1;
		}
		
		System.out.print(count);

	}

}

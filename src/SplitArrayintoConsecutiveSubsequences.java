
public class SplitArrayintoConsecutiveSubsequences {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3,3,4,4,5,5 };
//		int[] nums = {1,2,3,3,4,5};
		int count = 1;
		int start = 0;
		boolean flag = true;
		int n = nums.length;
		for (int end = 0; end < n - 1; end++) {
			if (nums[end + 1] - nums[end] == 1)
				count++;
			else if (nums[end + 1] - nums[end] == 0) {
				if (count >= 3) {
					count = 1;
					start = end + 1;
				} else
					flag = false;
			} else {
				if (count >= 3) {
					count = 1;
					start = end + 1;
				} else
					flag = false;
			}
		}
		if (flag == true && count < 3)
			flag = false;

		System.out.println("Flag " + flag);

	}

}

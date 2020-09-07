
public class MaxLengthofPositiveProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 9, 1, 3, -9, 6, -8, 2, 8, 9, 7, -8, 6, 4, 66 };
		// int[] nums = {3,4,5,6,7,9,-2,9,7,8};
		// int[] nums = {-6};
		int count = 0;
		int firstpos = 0, lastpos = 0;
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				count++;
				if (flag) {
					firstpos = i;
					lastpos = i;
					flag = false;
				} else
					lastpos = i;

			}

		}
		if (count % 2 == 0)
			System.out.println(nums.length);
		else {

			int max1 = Math.max(nums.length - (firstpos + 1), firstpos);
			int max2 = Math.max(nums.length - (lastpos + 1), lastpos);
			System.out.println(Math.max(max1, max2));

		}

	}

}

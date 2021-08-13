
public class Move_Negative_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
		
		for(int i : nums)
			System.out.println(i);

	}

}

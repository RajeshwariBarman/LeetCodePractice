
public class Move_Even_Odd_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 90, 89, 57, 30, 72, 91 };
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		
		for(int i  = 0 ; i<nums.length;i++)
			System.out.println(nums[i]);

	}

}

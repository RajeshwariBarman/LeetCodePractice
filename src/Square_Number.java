import java.util.Arrays;

public class Square_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,-1,0,3,10};
		for(int i = 0 ; i < nums.length ; i++)
			nums[i] = nums[i] * nums[i];
		Arrays.sort(nums);
		System.out.println(nums.toString());
	}

}

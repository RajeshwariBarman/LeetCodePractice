import java.util.Arrays;

public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,2,2};
		Arrays.sort(nums);
		
		for(int i = 0 ; i< nums.length-1;i++)
		{
			if(nums[i] == nums[i+1])
				System.out.println(nums[i]);
		}

	}

}

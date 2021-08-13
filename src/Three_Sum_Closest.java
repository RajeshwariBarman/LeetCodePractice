import java.util.Arrays;

public class Three_Sum_Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,2,1,-4};
		Arrays.sort(nums);
		int target = 1;
		int max = Integer.MAX_VALUE;
		
		for(int i = 0 ;i < nums.length-2 ;i++)
		{
			int low = i+1;
			int high = nums.length - 1;
			while(low < high)
			{
				int sum = nums[i] + nums[low] + nums[high];
				if(Math.abs(target - sum)<Math.abs(max))
				{
					max = target - sum;	
				}
				if(sum>target)
					low++;
				else
					high--;
			}
		}
		
		System.out.println(target - max);

	}

}

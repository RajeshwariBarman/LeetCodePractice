
public class MinimumOperationstoMaketheArrayIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,2,4,1};
		int count = 0;
		for(int i = 1; i< nums.length ;i++)
		{
			if(nums[i] - nums[i-1]>0)
				continue;
			else
			{
				count = count + Math.abs(nums[i] - nums[i-1]) + 1;
				nums[i] = nums[i] + Math.abs(nums[i] - nums[i-1]) + 1;
			}
		}
		
		System.out.println(count);

	}

}

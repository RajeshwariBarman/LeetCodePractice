
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,0,1,1,0,1};
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0 ;i<nums.length;i++)
		{
			//System.out.println(count);
			if(nums[i] == 1)
				count++;
			else
			{
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);

	}

}

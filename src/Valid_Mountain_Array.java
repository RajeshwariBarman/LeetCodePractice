
public class Valid_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,3,2,1};
		int increase_count = 0;
		int decrease_count = 0;
		int i  = 0;
		if(nums.length<3)
		{
			
		}
		for(i = 0 ; i <nums.length-1;i++)
		{
			if(nums[i]< nums[i+1])
				increase_count++;
			else if (nums[i] == nums[i+1])
			{
				
			}
			else
				break;
			
		}
//		System.out.println(increase_count);
		for(int j = i ; j <nums.length-1;j++)
		{
			if(nums[j] > nums[j+1])
				decrease_count++;
			else if (nums[j] == nums[j+1])
			{
				
			}
			else
				break;
			
		}
//		System.out.println(decrease_count);
		if(increase_count == 0 || decrease_count == 0)
		{
			System.out.println("No");
		}
		
		
		if(increase_count + decrease_count == nums.length-1)
		{
			System.out.println("yes");
		}

	}

}

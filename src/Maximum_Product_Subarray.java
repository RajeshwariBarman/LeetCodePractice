
public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] nums = {1,-2,3,-10,0,50,-100,20,-4,10};
		int[] nums = {-2};
		int cur_max = nums[0];
		int cur_min = nums[0];
		int max = nums[0];
		for(int i  = 1 ; i<nums.length;i++)
		{
			
			if(nums[i] ==0)
			{
				cur_min = 1;
				cur_max = 1;
			}
			
			int temp = cur_min*nums[i];
			cur_min = Math.min(cur_max*nums[i],temp);
			cur_min = Math.min(cur_min,nums[i]);
			
			cur_max = Math.max(cur_max*nums[i],temp);
			cur_max = Math.max(cur_max,nums[i]);
			
			max = Math.max(max, cur_min);
			max = Math.max(max, cur_max);
		}


		System.out.println(max);
	}
	
	

}

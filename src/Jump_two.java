
public class Jump_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums = {2,3,0,1,4};
		int[] nums = {2,1};
		int i = 0 ,count = 0; 
		while(i < nums.length-1)
		{
			int j = 1;
			int max = 0,start = 0;
			while(j<=nums[i] && (i+j)<nums.length)
			{
				if(max<nums[i+j])
				{
					max = nums[i+j];
					start = i+j;
				}
					
				j++;
			}
			
			i = start;
			count++;
		}
		
		System.out.println(count);

	}

}

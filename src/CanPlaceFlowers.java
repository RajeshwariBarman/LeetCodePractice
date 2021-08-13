
public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		//boolean flag = true;
		int n = 0,count=0;
		for(int i = 0 ;i< nums.length;i++)
		{
			if(nums[i] == 0)
			{
				int prev = (i ==0 || nums[i-1] == 0) ? 0:1;
				int next = (i ==nums.length-1 || nums[i+1] == 0) ? 0:1;
				if(prev ==0 && next == 0)
				{
					nums[i] = 1;
					count++;
				}
			}
		}
		
		if(count>=n)
			System.out.println("found");


	}

}

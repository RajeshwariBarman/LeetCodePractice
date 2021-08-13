
public class JumpGame {

	static boolean flag = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {2,4,2,1,4};
		int[] nums = {8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};
//		if(nums.length ==1 || ((nums.length == 2) && nums[0] ==1))
//			flag = true ;
//		solve(0,nums,nums[0]);
//		System.out.println(flag);
		
		int goodindex = nums.length-1;
		for(int i = nums.length-2;i>=0;i--)
		{
			System.out.println(i);
			if(i+nums[i]>=goodindex)
				goodindex = i;
		}
		System.out.println(goodindex);
		if(goodindex == 0)
			System.out.println("found");

	}
	
	static void solve(int index,int[]arr,int element)
	{
		int i = 1;
		while(i<=element)
		{
			int temp = arr[index+i];
			if(index+i == arr.length-1)
			{
				System.out.println("found");
				flag = true;
				break;
			}
			if(index+i<arr.length)
			{
				if(!flag)
					solve(index+i,arr,temp);
				//break;
			}
			if(!flag)
				i++;
			else
				break;
		}
	}

}

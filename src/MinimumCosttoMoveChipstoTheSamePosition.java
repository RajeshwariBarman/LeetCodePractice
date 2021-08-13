
public class MinimumCosttoMoveChipstoTheSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		int res;
		int counteven = 0 , countodd = 0;
		for(int i = 0 ; i<nums.length;i++)
		{
			if(nums[i]%2==0)
				counteven++;
			else
				countodd++;
				
		}
		
		res = Math.min(counteven, countodd);
		System.out.println(res);
		

	}

}

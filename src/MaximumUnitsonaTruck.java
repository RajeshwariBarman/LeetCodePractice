import java.util.Arrays;


public class MaximumUnitsonaTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{2,1},{4,4},{3,1},{4,1},{2,4},{3,4},{1,3},{4,3},{5,3},{5,3}};
		int boxsize = 13;
		int cost = 0;
		Arrays.sort(nums, (int[]a, int[]b) -> (b[1] - a[1]));
		
		Arrays
		  .stream(nums)
		  .forEach(a -> System.out.println(Arrays.toString(a)));
		
		
		for(int i = 0 ; i < nums.length;i++)
		{
			int key = nums[i][0];
			int val = nums[i][1];
			
			if(key<=boxsize)
			{
				cost = cost + key * val;
				boxsize  = boxsize - key;
			}
			else
			{
				cost = cost + val * boxsize;
				boxsize = 0;
			}
		}


		System.out.println(cost);
	}

}

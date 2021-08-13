
public class MaximumAbsoluteSumofAnySubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,-5,1,-4,3,-2};
		int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
		int currsum = 0;
		for(int i : nums)
		{
	     	currsum = currsum + i;				
			maxsum = Math.max(maxsum, currsum);
			if(currsum<0)
				currsum = 0;
			
		}
		currsum = 0;
		for(int i : nums)
		{
		    currsum = currsum + i;
			minsum = Math.min(minsum, currsum);
			if(currsum>0)
				currsum = 0;
			
		}
		System.out.println(maxsum);
		System.out.println(minsum);
	}

}

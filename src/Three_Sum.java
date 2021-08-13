import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {

	static HashSet<List<Integer>> res = new HashSet<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0};
		Arrays.sort(nums);
		//solve(3,0,new ArrayList<Integer>(),0,nums);
		//System.out.println(res);
		List<List<Integer>> res1 = new ArrayList<List<Integer>>();
	  	
	    
	    int length = nums.length;
	    for(int i = 0 ; i< length -2 ; i++ )
	    {
	    	if(i == 0 || nums[i] != nums[i-1])
	    	{
	    		int target = -nums[i];
	    		System.out.println("target" + target);
	    		int low = i+1;
	    		int high = length-1;
	    		while(low<high)
	    		{
	    			int sum = nums[low] + nums[high];
	    			if(sum == target)
	    			{
	    				List<Integer> res = new ArrayList<Integer>();
	    				res.add(nums[i]);
	    				res.add(nums[low]);
	    				res.add(nums[high]);
	    				res1.add(new ArrayList<Integer>(res));
		    			while(low<high && nums[low] == nums[low+1])
		    				low++;
		    			while(high >low && nums[high] == nums[high-1])
		    				high--;
		    			low++;
		    			high--;
	    			}else if (sum > target) high--;
	    			else low++;

	    		}
	    	}
	    }
	    
	    System.out.println(res1);

	}

	static void solve(int k, int sum, List<Integer> input, int j, int[] nums) {
		if (k == 0 && sum == 0) {
			// System.out.println(input);
			res.add(new ArrayList<Integer>(input));
			return;
		}
		if (k == 0)
			return;

		for (int i = j; i < nums.length; i++) {
			if (sum + nums[i] > 0)
				break;
			input.add(nums[i]);
			solve(k - 1, sum + nums[i], input, i + 1, nums);
			input.remove(input.size() - 1);

		}

	}

}

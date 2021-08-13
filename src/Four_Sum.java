import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Four_Sum {

	static HashSet<List<Integer>> res = new HashSet<List<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,-1,0,-2,2};
		Arrays.sort(nums);
		solve(4,0,new ArrayList<Integer>(),0,nums,0);
		//System.out.println(res);
		List<List<Integer>> res1 = new ArrayList<List<Integer>>(res);
	    System.out.println(res1);	

	}
	
	static void solve(int k , int sum , List<Integer> input, int j , int[] nums,int target)
	{
		if(k == 0 && sum == target)
		{
			//System.out.println(input);
			res.add(new ArrayList<Integer>(input));
			return;
		}
		if(k == 0)
			return;
		
		for(int i = j ; i<nums.length; i++)
		{
			if(sum + nums[i] > 0)
				break;
			input.add(nums[i]);
			solve(k-1,sum+nums[i],input,i+1,nums,target);
			input.remove(input.size()-1);
			
		}
	}

}

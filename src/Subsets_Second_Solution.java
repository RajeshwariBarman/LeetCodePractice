import java.util.ArrayList;
import java.util.List;

public class Subsets_Second_Solution {
	List<List<Integer>> res = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets_Second_Solution s1 = new Subsets_Second_Solution();
		int[] nums = {1,2,3};
		s1.subsets(nums);
		

	}

	public List<List<Integer>> subsets(int[] nums) {
		
        solve(new ArrayList<Integer>(),0,nums);
        System.out.println(res);
		return res;

	}

	void solve(List<Integer> output, int count, int[] nums) {

		List<Integer> temp = new ArrayList<Integer>(output);
		if (count == nums.length) {
			res.add(temp);
			System.out.println("res = "+res);
			return;
		}		
		count++;
		solve(temp,count,nums);
		temp.add(nums[count-1]);
		solve(temp,count,nums);
	}

}

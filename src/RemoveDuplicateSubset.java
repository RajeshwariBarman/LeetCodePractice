import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,4,4,1,4};
		RemoveDuplicateSubset s1 = new RemoveDuplicateSubset();
		Arrays.sort(nums);
		s1.subsetsWithDup(nums);
		
	}

	public int subsetsWithDup(int[] nums) {
		HashSet<ArrayList<Integer>> res = new HashSet<>();
		List<List<Integer>> res1 = new ArrayList<>();
		if (null == nums || nums.length == 0) {
			return 0;
		}
		subsets(nums, 0, new ArrayList<>(), res);
		for(List<Integer> a:res)
			res1.add(a);

		System.out.println(res1);
		return 0;
	}

	private void subsets(int[] nums, int index, List<Integer> cur, HashSet<ArrayList<Integer>> res) {
		res.add(new ArrayList<>(cur));
		for (int i = index; i < nums.length; i++) {
			cur.add(nums[i]);
			subsets(nums, i + 1, cur, res);
			cur.remove(cur.size() - 1);
		}
	}

}

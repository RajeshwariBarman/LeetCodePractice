import java.util.ArrayList;
import java.util.List;

public class Subsets {

	List<List<Integer>> res = new ArrayList<>();
	public static void main(String[] args)
	{
		int[] nums = {1,2,3};
		Subsets s1 = new Subsets();
		s1.subsets(nums);
		
	}

	public List<List<Integer>> subsets(int[] nums) {
		subset(nums,0, new ArrayList<>());
		System.out.println(res);
		return res;
	}


	void subset(int[] nums, int index, List<Integer> temp) {
		res.add(new ArrayList<>(temp));
		for (int i = index; i < nums.length; i++) {
			temp.add(nums[i]);
			subset(nums, i + 1, temp);
			temp.remove(temp.size() - 1);
		}
	}

}

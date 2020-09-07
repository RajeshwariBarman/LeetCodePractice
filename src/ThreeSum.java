import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -4, -1, -1,-1, 0, 1, 2 ,2};
		Arrays.sort(nums);
		// -4,-1,-1,0,1, 
		int target;
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (nums[i] != nums[i - 1])) {// this will handle the outer duplicates 
				target = 0 - nums[i];
				int low = i + 1;
				int high = nums.length - 1;
				while (low < high) {
					if ((nums[low] + nums[high]) < target)
						low++;
					else if ((nums[low] + nums[high]) > target)
						high--;
					else {
						res.add(Arrays.asList(nums[i],nums[low],nums[high]));
						// This will handle internal duplicates 
						while(low<high && nums[low] == nums[low+1])low++;
						while(low<high && nums[high] == nums[high-1])high--;
						low++;
						high--;
					}
				}
			}
		}

		System.out.println(res);

	}

}

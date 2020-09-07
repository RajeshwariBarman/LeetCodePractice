import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		// -2,-1,0,0,1,2
		int target = 0;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		// int sum, low, high;
		// Arrays.sort(nums);
		// for (int i = 0; i < nums.length - 3; i++) {
		// if(i>0 && nums[i]==nums[i-1]) continue;
		// for (int j = i + 1; j < nums.length - 2; j++) {
		// if ( j>i+1 && nums[j] == nums[j-1]) continue;
		// sum = target - (nums[i] + nums[j]);
		// low = nums[j + 1];
		// high = nums.length - 1;
		// while (low < high) {
		// if ((nums[low] + nums[high]) < sum)
		// low++;
		// else if ((nums[low] + nums[high]) > sum)
		// high--;
		// else {
		// res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
		// while (low < high && nums[low] == nums[low + 1])
		// low++;
		// while (low < high && nums[high] == nums[high - 1])
		// high--;
		// low++;
		// high--;
		// }
		//
		// }
		//
		//
		// }
		// }

		Arrays.sort(nums);
		// -2,-1,0,0,1,2
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int low = j + 1, high = nums.length - 1;
				int sum = target - (nums[i] + nums[j]);
				while (low < high) {
					if (sum == (nums[low] + nums[high])) {
						res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
						while (low < high && nums[low] == nums[low + 1])
							low++;
						while (low < high && nums[high] == nums[high - 1])
							high--;
						low++;
						high--;
					} else if ((nums[low] + nums[high])<sum) {
						low++;
					} else
						high--;
				}
			}
		}

		System.out.println(res);

	}

}

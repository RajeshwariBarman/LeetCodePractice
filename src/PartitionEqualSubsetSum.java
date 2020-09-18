import java.util.Arrays;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionEqualSubsetSum s1 = new PartitionEqualSubsetSum();
		boolean flag = s1.canPartitionKSubsets(new int[] {17,58,41,75,61,70,52,7,38,11,40,58,44,45,4,81,67,54,79,80,15,3,14,16,9,66,69,41,72,37,28,3,33,90,56,12,72,49,35,22,49,27,49,82,41,77,100,82,18,95,24,51,37,2,34,82,70,53,73,32,90,98,81,22,73,76,79,40,27,62,45,96,36,15,63,28,54,88,63,37,58,9,62,98,93,72,99,53,91,29,61,31,11,42,20,35,50,68,10,86});
		System.out.println(flag);
	}

	public boolean canPartitionKSubsets(int[] nums) {
		boolean flag = false;
		Arrays.sort(nums);
		int n = nums.length - 1;
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum = sum + nums[i];
		int target = sum / 2;
		System.out.println(target);
		int k = 2;
		if (nums[n] > target)
			return false;
		for (int i = n; i >= 0; i--) {
			if (k == 0)
				break;
			if (nums[i] == target && k != 0) {
				n--;
				k--;
			}
		}
		if (n == 0 && k == 0)
			return true;
		if (n > 0 && k == 0)
			return false;
		flag = search(nums, new int[k], target, n);
		return flag;

	}

	boolean search(int[] nums, int[] bucket, int target, int arraylength) {
		if (arraylength < 0)
			return true;
		int v = nums[arraylength];
		arraylength--;
		for (int i = 0; i < bucket.length; i++) {
			if (bucket[i] + v <= target) {
				bucket[i] = bucket[i] + v;
				if (search(nums, bucket, target, arraylength))
					return true;
				bucket[i] = bucket[i] - v;
			}
		}
		return false;
	}
}

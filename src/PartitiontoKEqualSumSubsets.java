import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitiontoKEqualSumSubsets s1 = new PartitiontoKEqualSumSubsets();
		boolean flag = s1.canPartitionKSubsets(new int[] { 4, 3, 2, 3, 5, 2, 1 }, 4);
		System.out.println(flag);
	}

	public boolean canPartitionKSubsets(int[] nums, int k) {
		boolean flag = false;
		Arrays.sort(nums);
		int n = nums.length - 1;
		int sum = 0;
		for (int i = 0; i <= n; i++)
			sum = sum + nums[i];
		int target = sum / k;
		if (nums[n] > target)
			return false;
		for (int i = n; i >= 0; i--) {
			if (nums[i] == target) {
				n--;
				k--;
			}
		}
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

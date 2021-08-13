import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceinNonIncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 10, 9, 8 };
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		int sum = 0, sumex = 0;
		for (int i : nums)
			sum = sum + i;

		for (int i = nums.length - 1; i >= 0; i--) {
			sumex = sumex + nums[i];
			sum = sum - nums[i];
			if(sum < sumex)
			{
				list.add(nums[i]);
				break;
			}
			
			list.add(nums[i]);
		}
		
		System.out.println(list);

	}

}

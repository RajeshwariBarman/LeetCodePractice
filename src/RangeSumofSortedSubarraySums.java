import java.util.ArrayList;
import java.util.Collections;

public class RangeSumofSortedSubarraySums {

	ArrayList<Integer> res = new ArrayList<>();

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int left = 3;
		int right = 4;
		int mod = 1000000007;
		int result = 0;
		ArrayList<Integer> res = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < nums.length ; i++) {
			res.add(nums[i]);
			sum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				sum = sum + nums[j];
				res.add(sum);
			}
			sum = 0;		
		}
		Collections.sort(res);
		for(int i = left-1 ; i < right ;i++)
			result = (result + res.get(i))%mod;
			
		System.out.println(res);
		System.out.println(result);
	}
}

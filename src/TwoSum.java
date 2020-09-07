import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,2,4, 7, 11, 3};
		int target = 6;
		HashMap<Integer, Integer> map = new HashMap<>();
		int complement;
		for (int i = 0; i < nums.length; i++) {
			complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.println(map.get(complement));
				System.out.println(i);
			} else
				map.put(nums[i], i);
		}

	}

}

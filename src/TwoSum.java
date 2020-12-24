import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4, 7, 11, 8,3,2,4,-2};
		int target = 6;
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		int complement;
		for (int i = 0; i < nums.length; i++) {
			complement = target - nums[i];
			if (map.containsKey(complement)) {
				System.out.print(map.get(complement) +" ");
				System.out.print(i);
				set.add(complement+":"+nums[i]);
			} else
				map.put(nums[i], i);
			System.out.println();
		}
		
		System.out.println(set);

	}

}

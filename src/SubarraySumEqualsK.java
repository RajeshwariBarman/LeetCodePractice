import java.util.HashMap;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using cumulative sum
		int[] nums = { 1, 1, 1 };
		int k = 2;
		int count = 0, sum = 0;
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < n; i++) {
			sum = sum + nums[i];
			if (map.containsKey(sum - k))
				count = count + map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		System.out.println(count);

	}

}

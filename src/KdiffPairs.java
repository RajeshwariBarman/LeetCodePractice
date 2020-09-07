import java.util.HashMap;

public class KdiffPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 3, 1, 4, 1, 5 };
//		int k = 2;
		int[] nums = {1,3,1,5,4};
		int k = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		if (k > 0) {
			for (int i : nums) {
				map.put(i, i - k);
			}
			for (int i : map.values()) {
				if (map.containsKey(i))
					count++;
			}
		} else if (k == 0) {
			for (int i : nums) {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
			for (int i : map.values()) {
				if (i >1)
					count++;
			}

		}

		System.out.println(count);
	}

}

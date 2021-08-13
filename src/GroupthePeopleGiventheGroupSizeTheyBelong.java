import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupthePeopleGiventheGroupSizeTheyBelong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3, 3, 3, 3, 1, 3 };
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			if (map.containsKey(key)) {
				if (map.get(key).size() == key) {
					res.add(map.get(key));
					map.put(key, new ArrayList<Integer>());
					map.get(key).add(i);
				} else {
					map.get(key).add(i);
				}
			} else {
				map.put(key, new ArrayList<Integer>());
				map.get(key).add(i);
			}
		}

		 map.forEach((k, v) -> res.add(v));
		 System.out.print(res);

	}

}

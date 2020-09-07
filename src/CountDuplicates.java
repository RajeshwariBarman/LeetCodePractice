import java.util.HashMap;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = { 1, 3, 4, 1, 3, 6, 2, 2, 1, 8 };
		char[] nums = {'a','r','s','c','a','f','s','c','a','j','l',};
		HashMap<Object, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		System.out.println(map);
	}

}

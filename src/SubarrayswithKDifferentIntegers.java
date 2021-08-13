import java.util.HashMap;
import java.util.HashSet;

public class SubarrayswithKDifferentIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 2, 3 };
		int k = 2;
		System.out.println(calculate(nums, k));
		System.out.println(calculate(nums, k-1));

	}
	
	static int calculate(int[] nums ,int k )
	{
		int count = 0;
		int countkarrays = 0;
		int start = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
				count++;
			} else
				map.put(nums[i], map.get(nums[i]) + 1);
			
			System.out.println(map);
			System.out.println("count = "+count);
			System.out.println("count arrays = "+countkarrays);
			
			if (count <=k)
				countkarrays = countkarrays + (i-start) + 1;
			else {
				while (start <= i && start < nums.length && count > k) {
					map.put(nums[start], map.get(nums[start]) - 1);
					if (map.get(nums[start]) == 0)
					{
						count--;
						map.remove(nums[start]);
					}
						
					start++;
					System.out.println("in while "+map);
					System.out.println("count while = "+count);
					System.out.println("count arrays while = "+countkarrays);
				}
					countkarrays = countkarrays + (i-start) + 1;
					System.out.println(map);
					System.out.println("count arrays outer while = "+countkarrays);
			}

		}
		
		return countkarrays;
	}

}

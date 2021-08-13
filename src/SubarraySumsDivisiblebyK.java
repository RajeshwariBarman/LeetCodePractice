import java.util.HashMap;

public class SubarraySumsDivisiblebyK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,0,-2,-3,1};
		int k = 5;
    	int count = 0;
    	int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			int sum = 0;
//			for (int j = i; j < nums.length; j++) {
//				sum = sum + nums[j];
//				if (sum % 5 == 0)
//					count++;
//			}
//		}
//		
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for(int i : nums)
		{
			sum = sum + i;
			int key = sum % k;
			if(key<0)
				key = k + key;
			if(map.containsKey(key))
				count = count + map.get(key);
			map.put(key, map.getOrDefault(key,0)+1);
		}
		
		System.out.println(count);

	}

}

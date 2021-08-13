import java.util.HashMap;

public class Contiguous_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,0,0,1,1,1,0,1,1,1,1,1,0};
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int max = 0;
		int count = 0;
		for(int i = 0 ; i<nums.length ;i++)
		{
			count = count + (nums[i] == 0 ?-1:1);
			if(map.containsKey(count))
				max = Math.max(max, i-map.get(count));
			else
				map.put(count,i);
		}
		
		System.out.println(max);

	}

}

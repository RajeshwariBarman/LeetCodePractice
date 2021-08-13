import java.util.HashMap;

public class CheckIfNandItsDoubleExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,7,11};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<nums.length ;i++)
		{
			if( nums[i]%2== 0 && map.containsKey(nums[i]/2))
			{
				System.out.println(i);
				System.out.println(map.get(nums[i]/2));
			}
			else if(map.containsKey(nums[i]*2))
			{
				System.out.println(i);
				System.out.println(map.get(nums[i]*2));
			}
			else
				map.put(nums[i],i);
		}

	}

}

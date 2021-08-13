import java.util.HashMap;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,1,3,2,5};
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i< nums.length;i++)
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		for(Integer i: map.keySet())
		{
			if(map.get(i) == 1)
				System.out.println(i);
		}		

	}

}

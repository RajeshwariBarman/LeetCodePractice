import java.util.HashMap;

public class CountNumberofNiceSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,2,1,2,2,1,2,2,2};
		int k = 2;
//		int count = 0;
//		int sum = 0;
//		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
//		map.put(0,1);
//		for(int i = 0 ; i< nums.length;i++)
//		{
//			if(nums[i]%2 == 0)
//				nums[i] = 0;
//			else
//				nums[i] = 1;
//		}
//		for(int i = 0; i< nums.length;i++)
//		{
//			sum = sum + nums[i] ; 
//			int key = sum - k;
//			if(map.containsKey(key))
//				count = count + map.get(key);
//			map.put(sum,map.getOrDefault(sum,0)+1);
//		}
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = 0;
        int currCount = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 1) 
            	currCount ++;
            if(map.containsKey(currCount - k)) 
            	ans += map.get(currCount - k);
            map.put(currCount, map.getOrDefault(currCount,0)+1);
        }

		System.out.println(ans);
		System.out.println(map);
	}

}

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int start = 0;
		int max = Integer.MIN_VALUE;
		for(int end = 0 ; end<s.length();)
		{
			char c = s.charAt(end);
			if(map.containsKey(c))
			{
				map.remove(s.charAt(start));
				start++;
				System.out.println("start1= "+start);
				
			}
			else
			{
				max = Math.max(max,(end-start)+1);
				end++;
				map.put(c, 0);
				System.out.println("map= "+map);
			}
			
		}
		
		System.out.println(max);

	}

}

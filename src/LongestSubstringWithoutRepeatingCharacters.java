import java.util.HashMap;


public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		String s = "abcabcbb";
//		String s = "bbbbbb";
		char c;
		int windowstart = 0;
		int count = 0;
		for (int windowend = 0; windowend < s.length();) {
			c = s.charAt(windowend);
			if (map.containsKey(c)) {
				map.remove(s.charAt(windowstart));
				windowstart++;
			} else {
				map.put(c, 0);
				count = Math.max(count, (windowend-windowstart+1));
				windowend++;
			}
		}
		
		System.out.println(count);

	}

}

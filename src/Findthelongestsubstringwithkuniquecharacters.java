import java.util.HashSet;

public class Findthelongestsubstringwithkuniquecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabacbebebe";
		HashSet<Character> set = new HashSet<Character>();
		int count = 0;
		int max = Integer.MIN_VALUE;
		int k = 3;
		for (char c : s.toCharArray()) {
			if (!set.contains(c)) {
				count++;
				set.add(c);
				if (count >= k)
					max = Math.max(max, count);
			}
		}
		
		System.out.println(max);

	}

}

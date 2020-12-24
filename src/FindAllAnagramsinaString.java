import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "cbaebabacd";
		 String p = "abc";
		//sliding window - https://www.geeksforgeeks.org/compare-two-arrays-java/
		
		//String s = "baa";
		//String p = "aa";
		ArrayList<Integer> res = new ArrayList<Integer>();
		int n = s.length();
		int pattern = p.length();
		if(pattern > n )
			System.out.println("not possible");
		int startwindow = 0;
		int[] map = new int[26];
		int[] pmap = new int[26];
		Character ch;
		for (int i = 0; i < pattern; i++) {
			ch = p.charAt(i);
			pmap[ch - 'a']++;
			map[s.charAt(i) - 'a']++;
		}

		if (Arrays.equals(map, pmap))
			res.add(startwindow);

		for (int windowend = pattern; windowend < n; windowend++) {
			ch = s.charAt(windowend);
			map[ch - 'a']++;
			map[s.charAt(startwindow) - 'a']--;
			startwindow++;
			if (Arrays.equals(map, pmap))
				res.add(startwindow);
		}

		System.out.println(res);
		
	}

}

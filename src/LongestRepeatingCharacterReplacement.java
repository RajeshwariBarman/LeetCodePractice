
public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 424. - using sliding window
		// https://www.youtube.com/watch?v=00FmUN1pkGE&t=532s
		String s = "BABAABBCBB";
		int k = 2;
		int windowstart = 0;
		int maxcount = 0;
		int[] charcount = new int[26];
		int n = s.length();
		int maxlen = 0;
		char c;
		for (int windowend = 0; windowend < n; windowend++) {
			c = s.charAt(windowend);
			charcount[c - 'A']++;
			maxcount = Math.max(maxcount, charcount[c - 'A']);
			if (windowend - windowstart - maxcount + 1 > k) {
				charcount[s.charAt(windowstart) - 'A']--;
				windowstart++;
			}

			maxlen = Math.max(maxlen, windowend - windowstart + 1);
		}

		System.out.println(maxlen);

	}

}

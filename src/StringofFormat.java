//https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/
public class StringofFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAABBBBBBBB";

		int counta = 0, countb = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'A')
				counta++;
			else
				countb++;
		}

		if (counta > countb) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'A')
					counta--;
				else {
					if (counta != 0)
						count++;
				}
			}
		} else if (countb > counta) {

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == 'B')
					countb--;
				else {
					
				}
			}

		}

		System.out.print(count);

	}

}

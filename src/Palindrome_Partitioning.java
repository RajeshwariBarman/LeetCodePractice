import java.util.ArrayList;
import java.util.List;


public class Palindrome_Partitioning {

	static List<List<String>> res = new ArrayList<List<String>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		solve(0, new ArrayList<String>(), s);
		System.out.println(res);

	}

	static void solve(int index, List<String> input, String s) {
		System.out.println(input);
		if (index == s.length()) {
			res.add(new ArrayList<String>(input));
			return;
		}
		for (int i = index; i < s.length(); i++) {
			if (isPalindrome(s, index, i)) {
				input.add((String) s.subSequence(index, i + 1));
				solve(i + 1, input, s);
				input.remove(input.size() - 1);
			}
		}
	}

	static boolean isPalindrome(String str, int start, int end) {
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			++start;
			--end;
		}

		return true;
	}

}

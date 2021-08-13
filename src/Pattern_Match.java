import java.util.ArrayList;
import java.util.List;

/*
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.
 */
public class Pattern_Match {

	static List<String> res = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";
		String pattern = "cba";
		solve(input, "", res);
		for (String s : res) {
			if (s.contains(pattern))
				System.out.println(s);
		}
		// System.out.println(res.toString());

	}

	public static void solve(String input, String output, List<String> result) {
		if (input.length() == 0) {
			result.add(output);
			return;
		}
		for (int i = 0; i < input.length(); i++) {

			String tempoutput = output + input.charAt(i);
			String tempinput = input;
			tempinput = input.substring(0, i) + input.substring(i + 1);
			solve(tempinput, tempoutput, result);
		}
	}

}

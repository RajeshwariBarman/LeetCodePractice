
public class Score_of_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()(()))";
		int open = 0, count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				open++;
			else {
				open--;
				count++;
			}
		}
		System.out.println(count);
	}

}

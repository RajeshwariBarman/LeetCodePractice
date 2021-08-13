
public class MinimumAddtoMakeParenthesesValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()))((";
		int count_bal = 0, count_extra = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				count_bal++;
			else {
				if (count_bal == 0)
					count_extra++;
				else
					count_bal--;
			}

		}
		
		System.out.println(count_bal + count_extra);

	}

}

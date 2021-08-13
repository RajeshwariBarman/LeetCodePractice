import java.util.Arrays;

public class CheckIfaStringCanBreakAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "leetcodee";
		String s2 = "interview";
//		if(s1.length() != s2.length())
//			return false;
		boolean flag = true;
		char[] temp1 = s1.toCharArray();
		Arrays.sort(temp1);

		char[] temp2 = s2.toCharArray();
		Arrays.sort(temp2);

		System.out.println(temp1);
		System.out.println(temp2);

		for (int i = 0; i < temp1.length; i++) {
			if (temp1[i] >= temp2[i])
				continue;
			else
				flag = false;
		}
		if (flag == false) {
			flag = true;
			for (int i = 0; i < temp1.length; i++) {
				if (temp2[i] >= temp1[i])
					continue;
				else
					flag = false;
			}

			System.out.println(flag);

		}

	}
}

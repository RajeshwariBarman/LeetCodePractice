public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcabcabc";
		String s1 = s+s;
		int index = s1.indexOf(s, 1);
		if(index != -1 && index < s.length())
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}

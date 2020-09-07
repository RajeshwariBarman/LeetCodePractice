
public class ConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccddddeeeeedcba";
		char[] c = s.toCharArray();
		int count = 0;
		int max = 0;
		int n = c.length;
		for (int i = 0; i < n - 1; i++) {
			if (c[i] == c[i + 1])
				count++;
			else
				count = 0;
			max = Math.max(max, count);
		}
		System.out.println(max+1);

	}

}

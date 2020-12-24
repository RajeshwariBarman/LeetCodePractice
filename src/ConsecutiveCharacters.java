
public class ConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaaaaaaabbcccddddeeeeedcba";
		char[] c = s.toCharArray();
		int count = 0;
		int max = 0;
		int n = c.length;
		for (int i = 0; i < n - 1; i++) {
			if (c[i] == c[i + 1])
				count++;
			else {
				max = Math.max(max, count);
				count = 0;				
			}

		}
		System.out.println(max + 1);

	}

}

import java.util.LinkedHashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "paper";
//		String t = "title";
		 String s = "ab";
		 String t = "aa";

		int n = s.length();
		System.out.println(n);
		char a, b;
		boolean flag = true;
		LinkedHashMap<Character, Character> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			a = s.charAt(i);
			b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a) == b)
					flag = true;
				else {
					flag = false;
					break;
				}
			} else {
				if (map.containsValue(b)) {
					flag = false;
					break;
				} else
					map.put(a, b);
			}
		}

		System.out.println(map);
		System.out.println(flag);

	}
}

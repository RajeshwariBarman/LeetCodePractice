import java.util.HashMap;

public class CowsAndBulls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "1122";
		String guess = "1222";
		int n = guess.length();
		int cow = 0, bull = 0;
		char ch;
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : secret.toCharArray())
			map.put(c, map.getOrDefault(c,0)+1);
		for (int i = 0; i < n; i++) {
			ch = guess.charAt(i);
			if(map.containsKey(ch))
			{
				if(ch == secret.charAt(i))
				{
					bull++;
					if(map.get(ch)<=0)
						cow--;
				}
				else
				{
					if(map.get(ch)>0)
						cow++;
				}
				map.put(ch, map.get(ch) - 1);
			}
		}
		System.out.print(bull+"A"+cow+"B");
		}

}

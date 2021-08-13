import java.util.HashMap;

public class Custom_Sort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "cbccafg";
		String T = "abcdef";
		String output = "";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < T.length();i++)
		{
			char a = T.charAt(i);
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		System.out.println(map);
		for(int i = 0; i < S.length();i++)
		{
			char a = S.charAt(i);
			if(map.containsKey(a) && map.get(a) != 0)
			{
				int count = map.get(a);
				for(int j = 0 ; j<count;j++)
					output = output + a;
				map.put(a,0);
			}
			else
				break;
		}
		for(Character key : map.keySet())
		{
			int count = map.get(key);
			for(int i = 0 ; i<count;i++)
				output = output + key;
			map.put(key,0);
		}
		System.out.println("output = "+output);

	}
	
	

}

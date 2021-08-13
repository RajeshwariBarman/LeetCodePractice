import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] index = new int[26];
		String s = "abcdedfggh";
		int count = 0;
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0 ; i<s.length();i++)
		{
			char c = s.charAt(i);
			index[c-'a'] = i;
		}
		
		int max = index[s.charAt(0)-'a'];
		for(int i = 0 ; i<s.length();i++)
		{
			if(i<=max)
			{
				count++;
				max = Math.max(max, index[s.charAt(i)-'a']);
			}else
			{
				res.add(count);
				count = 1;
				max = index[s.charAt(i)-'a'];	
			}
		}
		
		res.add(count);
		System.out.println(res);

	}

}

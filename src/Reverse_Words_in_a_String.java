import java.util.ArrayList;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s2 = s.trim();
//		char[] input = s2.toCharArray();
//		StringBuilder s1 = new StringBuilder();
//		ArrayList<String> list = new ArrayList<String>();
//		int count = 0;
//		for (int i = 0; i < input.length; i++) {
//			System.out.println(input[i]);
//			System.out.println(count);
//			if (input[i] == ' ' && count == 0) {
//				list.add(s1.toString());
//				list.add(" ");
//				count++;
//				s1.setLength(0);
//			} 
//			if(input[i] != ' ' )
//			{
//				count = 0;
//				s1.append(input[i]);	
//			}
//		}
//		list.add(s1.toString());
//		s1.setLength(0);
//		for(int i = list.size()-1 ; i>=0;i--)
//		{
//			s1.append(list.get(i));
//		}
//		System.out.println(s1);
 
		
		String s = "__Bob___Loves__Alice_____";
		int start = 0;
		StringBuilder s2 = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != '_') {
				if (!flag) {
					start = i;					
				}
				flag = true;
			}
			else
			{
				if(flag)
				{					
					s2.insert(0,"_"+s.substring(start,i));					
				}
				flag = false;
			}
		}
		
		if(flag)
		{
			flag = false;
			s2.insert(0,"_"+s.substring(start));	
		}
		
		
		System.out.println(s2);

	}

}

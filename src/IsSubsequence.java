 	 	 	
public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc", t = "ahbgdc";
//		String s = "", t = "abc";
		int count = 0 ;
		for(char c : t.toCharArray())
		{
			if(count<s.length())
			{
				if(s.charAt(count) == c)
					count++;
			}
			
		}
		
		if(count == s.length())
			System.out.println(count);
		else
			System.out.println(count);
	     

	}

}

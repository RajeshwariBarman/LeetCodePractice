
public class MinimumDeletionstoMakeStringBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "baa";
		int countb = 0,prev = 0;
		int min = 0;
		for(int i = 0 ; i<s.length();i++)
		{
			char c = s.charAt(i);			
			if(c == 'b')
				countb++;
			else
			{
				min = Math.min(min+1, countb);
					

			}
		}
	    
		
		System.out.println(min);

	}

}

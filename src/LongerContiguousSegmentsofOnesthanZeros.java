
public class LongerContiguousSegmentsofOnesthanZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "110100010";
		int countone = 0 , countzero =0;
		int maxcountone = Integer.MIN_VALUE;
		int maxcountzero = Integer.MIN_VALUE;
		

		
		for(int i = 0; i <s.length()-1;i++)
		{
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			
			if(c1 == c2  && c1 == '1')
				countone++;
			if(c1 == c2  && c1 == '0')
				countzero++;
			if(c1 != c2)
			{
				countone = 0;
				countzero =0;
			}
			
			maxcountone = Math.max(maxcountone, countone);
			maxcountzero = Math.max(maxcountzero, countzero);
		}
		
		
		
		System.out.println(maxcountone);
		System.out.println(maxcountzero);
		

	}

}

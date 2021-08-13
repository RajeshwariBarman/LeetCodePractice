
public class CheckifBinaryStringHasatMostOneSegmentofOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "111110011110011";

		System.out.println(solve(s));

	}
	
	static boolean solve(String s )
	{
        for(int i = 0;i < s.length() - 1; i++)
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1') return false;
        return true; 
	}

}

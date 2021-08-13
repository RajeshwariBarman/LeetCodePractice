import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] map = { "0","1","abc","def","jkl","mno","qprs","tuv","wxyz"};
		String digit = "235";
		ArrayList<String> res = new ArrayList<String>();
		res = solve("",map,0,res,digit.length(),digit);
		System.out.println(res);

	}
	
	static ArrayList<String> solve(String output , String[] map,int i, ArrayList<String>l1, int n, String digit)
	{
		if(output.length() == n)
		{
			l1.add(output);
			return l1;
		}
        for(char c : map[digit.charAt(i) - '0'].toCharArray())
        {
        	solve(output+c,map,i+1,l1,n,digit);
        }
		return l1;		
	}

}

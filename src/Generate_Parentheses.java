import java.util.ArrayList;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("", 3, 3,new ArrayList<String>()));
		

	}
	static ArrayList<String> solve(String output, int open, int close,ArrayList<String>s1) {
		// my approach				
		if (open == 0 && close == 0) {
			s1.add(output);
			return s1;
		}	
		if (open != 0)
			solve(output + "(", open - 1, close,s1);	
		if (open < close)
			solve(output + ")", open, close - 1,s1);
		
		return s1;
	}

}

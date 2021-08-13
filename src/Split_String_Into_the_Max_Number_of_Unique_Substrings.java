import java.util.HashSet;

public class Split_String_Into_the_Max_Number_of_Unique_Substrings {

	static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Split_String_Into_the_Max_Number_of_Unique_Substrings s1 = new Split_String_Into_the_Max_Number_of_Unique_Substrings();
		String input = "ababccc";
		//String input = "aba";
		s1.solve(new HashSet<String>(), input, 0);
		System.out.println(max);

	}

	void solve(HashSet<String> set, String input, int index) {
		String output = "";	
		if(index == input.length())
		{
			System.out.println(set);
			max = Math.max(max, set.size());
			return;
		}
		for (int i = index; i < input.length(); i++) {
			output = output + input.charAt(i);
			if (!set.contains(output)) {
				set.add(output);
				solve(set, input, i + 1);
				set.remove(output);
			}
		}
	}

}

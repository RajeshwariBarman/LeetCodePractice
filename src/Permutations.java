import java.util.ArrayList;
import java.util.List;
public class Permutations {
	
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		solve(input,new ArrayList<Integer>(),res);
		System.out.println(res.toString());

	}
	
	public static void solve(ArrayList<Integer> input, ArrayList<Integer> output,List<List<Integer>> result)
	{
		if(input.size() == 0)
		{
			result.add(new ArrayList<Integer>(output));
			//System.out.println(result.toString());
			System.out.println(output.toString());
			return;
		}				
		for(int i = 0 ; i < input.size() ;i++)
		{
			
			ArrayList<Integer> tempoutput = new ArrayList<Integer>(output);
			tempoutput.add(input.get(i));
			ArrayList<Integer> tempinput = new ArrayList<Integer>(input);
			tempinput.remove(i);
			solve(tempinput,tempoutput,result);
			//output.remove(output.size()-1);
		}
	}
	
	

}

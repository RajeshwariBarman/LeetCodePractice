import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutation_II {

	static HashSet<List<Integer>> res = new HashSet<List<Integer>>();
	static List<List<Integer>> result1 = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i : nums)
			input.add(i);
    	solve(input, new ArrayList<Integer>());
		List<List<Integer>> result = new ArrayList<List<Integer>>(res);
		System.out.println(result);
		//Arrays.sort(nums);
	}

	static void solve(List<Integer> input, List<Integer> output) {
		if (input.size() == 0) {
			res.add(output);
			return;
		}

		for (int i = 0; i < input.size(); i++) {
			List<Integer> tempinput = new ArrayList<Integer>(input);
			List<Integer> tempoutput = new ArrayList<Integer>(output);
			tempoutput.add(input.get(i));
			tempinput.remove(i);
			solve(tempinput, tempoutput);
		}
	}
	
//	static void permutation(List<Integer> input, List<Integer> output) {
//		System.out.println("input= "+input);
//		if (input.size() == 0) {
//			result1.add(output);
//			return;
//		}
//
//		for (int i = 0; i < input.size(); i++) {
//			if(i>0)
//			{
//				System.out.println("input pev= "+input.get(i-1));
//				System.out.println("input current= "+input.get(i));
//			}
//		    if(i > 0 && input.get(i) == input.get(i - 1)) continue;
//			List<Integer> tempinput = new ArrayList<Integer>(input);
//			List<Integer> tempoutput = new ArrayList<Integer>(output);
//			tempoutput.add(input.get(i));
//			tempinput.remove(i);
//			permutation(tempinput, tempoutput);
//		}
//	}

}

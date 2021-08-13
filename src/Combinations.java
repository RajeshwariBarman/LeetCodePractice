import java.util.ArrayList;
import java.util.List;

public class Combinations {

	static List<List<Integer>> res = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	solve(new ArrayList<Integer>(), 1,2,4);
    	System.out.println(res);
	}

	static void solve(List<Integer> input, int count , int k ,int n) {
		if (input.size() == k) {
			//System.out.println(input);
			res.add(new ArrayList<Integer>(input));
			return;
		}

		for (int i = count; i <=n; i++) {
			input.add(i);
			solve(input, i+1,k,n);
			input.remove(input.size()-1);		
		}
	}

}

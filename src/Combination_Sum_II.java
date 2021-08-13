import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Combination_Sum_II {

	static HashMap<List<Integer>,Integer> res = new HashMap<List<Integer>, Integer>();
	static List<List<Integer>> result = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = new int[] { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(candidates);
		solve(8, candidates, 0, 0, new ArrayList<Integer>());
		//sequence(8, candidates, 0,0, new ArrayList<Integer>());
		System.out.println(res.keySet());

	}

	static void solve(int target, int[] candidates, int count, int sum, List<Integer> input) {
		if (count > candidates.length)
			return;
		if (sum > target)
			return;
		if (target == sum) {
			if (!res.containsKey(input))
				res.put(input, 0);

			System.out.println("OUTPUT=" + input);
			return;
		}

		for (int i = count; i < candidates.length; i++) {
			sum = sum + candidates[i];
			List<Integer> temp = new ArrayList<Integer>(input);
			temp.add(candidates[i]);
			solve(target, candidates, i + 1, sum, temp);
			sum = sum - candidates[i];
		}
	}
	
	static void sequence(int target, int[] candidates, int count, int sum, List<Integer> input)
	{
		//System.out.println(input);
		
		if (count > candidates.length)
			return;
		if (sum > target)
			return;
		if (target == sum) {
            result.add(input);
			return;
		}

		for (int i = count; i < candidates.length; i++) {
			if( (i<candidates.length-1) && candidates[i] != candidates[i+1])
			{
				sum = sum + candidates[i];
				List<Integer> temp = new ArrayList<Integer>(input);
				temp.add(candidates[i]);
				sequence(target, candidates, i + 1, sum, temp);
				sum = sum - candidates[i];
			}

		}
		
	}

}

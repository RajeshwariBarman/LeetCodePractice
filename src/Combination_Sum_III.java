import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
	
	static List<List<Integer>> res = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solve(3,9,0,new ArrayList<Integer>(),1);
		System.out.println(res);

	}
	
	static void solve(int k , int n , int sum , List<Integer> input, int j)
	{
		if(k == 0 && sum == n)
		{
			System.out.println(input);
			res.add(new ArrayList<Integer>(input));
			return;
		}
		if(k == 0)
			return;
		
		for(int i = j ; i<= 9 ; i++)
		{
			if(sum + i > n)
				break;
			input.add(i);
			solve(k-1,n,sum+i,input,i+1);
			input.remove(input.size()-1);
			
		}
	}

}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Numbers_With_Same_Consecutive_Differences {

	static Set<Integer> res = new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2 , k = 0;
		for(int i = 1 ; i<=9 ; i++)
		{
			solve(i, n-1, k);
		}

		res.stream().mapToInt(i->i).toArray();
	}
	
	static void solve(int num , int n , int k )
	{
		if(n == 0)
		{
			System.out.println(num);
			res.add(num);
			return;
		}
		
		int digit = num % 10;
		if(digit + k < 10 )
		{
			int temp = num * 10 + digit + k;
			solve(temp, n-1, k);
		}
		
		if(digit - k >= 0 )
		{
			int temp = num * 10 + digit - k;
			solve(temp, n-1, k);
		}
	}

}

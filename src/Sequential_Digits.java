import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequential_Digits {

	static List<Integer> res = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int low = 1000;
		int high = 1000000000;
		for (int i = 1; i <= 9; i++) 
			solve(i, "" + i, low, high);

		Collections.sort(res);
		System.out.println(res);

	}

	static void solve(int i, String output, int low, int high) {
		
		System.out.println("output = "+output);
		if(i>9)
			return;
		int num = Integer.parseInt(output);
		if (num > high)
			return;
		if ((num >= low) && (num <= high))
			res.add(num);

		solve(i + 1, output + (i + 1), low, high);
	}

}

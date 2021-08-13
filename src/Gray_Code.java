import java.util.ArrayList;
import java.util.Collections;

public class Gray_Code {

	static ArrayList<String> res = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> result = new ArrayList<Integer>();
		res.add("0");
		res.add("1");
		solve(Math.pow(2, 1));
		for(String s : res)
			result.add(Integer.parseInt(s, 2));
		System.out.println(result);

	}

	static void solve(double n) {
		if (res.size() == n)
			return;
		ArrayList<String> tempres = new ArrayList<String>(res);
		Collections.reverse(res);
		ArrayList<String> temprev = new ArrayList<String>(res);
		res.clear();
		for (int i = 0; i < tempres.size(); i++)
			res.add("0" + tempres.get(i));
		for (int i = 0; i < temprev.size(); i++)
			res.add("1" + temprev.get(i));
		solve(n);

	}

}

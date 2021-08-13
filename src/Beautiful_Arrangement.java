import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Beautiful_Arrangement {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		List<Integer> output = new ArrayList<Integer>();
		solve(visited, output, n, 0);
		System.out.println(res);
		solve2(visited,n,1);
		System.out.println(count);

	}

	static void solve(boolean[] visited, List<Integer> output, int n, int pos) {
//		System.out.println(output);
//		System.out.println("pos= "+pos);
		if (output.size() == n) {
			// System.out.println(output);
			res.add(output);
			return;
		}
		for (int i = 1; i <= n; i++) {
			pos = output.size() + 1;
			ArrayList<Integer> tempoutput = new ArrayList<Integer>(output);
			if (visited[i - 1] != true) {
				if (i % pos == 0 || pos % i == 0) {
					visited[i - 1] = true;
					tempoutput.add(i);
					solve(visited, tempoutput, n, pos);
					visited[i - 1] = false;
				}

			}
		}
	}

	static void solve2(boolean[] visited, int n, int pos) {
		if (pos > n) {
			count++;
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (visited[i - 1] != true) {
				if (i % pos == 0 || pos % i == 0) {
					visited[i - 1] = true;
					solve2(visited, n, pos+1);
					visited[i - 1] = false;
				}

			}
		}
	}

}

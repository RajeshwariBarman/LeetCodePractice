
public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1004. Max Consecutive Ones III
		// using sliding window
		int[] A = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k = 3;
		int maxlen = 0;
		int windowstart = 0;
		int countones = 0;
		int n = A.length;
		for (int windowend = 0; windowend < n; windowend++) {

			if (A[windowend] == 1)
				countones++;
			if (windowend - windowstart + 1 - countones > k) {
				if (A[windowstart] == 1)
					countones--;
				windowstart++;
			}
			maxlen = Math.max(maxlen, windowend-windowstart+1);
		}
		System.out.println(maxlen);
	}

}

import java.util.HashMap;

public class SwapCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 5 };
		int[] b = { 2, 4 };
		int diff;

		// equation
		// sum1 + y -x = sum2 + x - y
		// 2y = sum2 - sum1 + 2x
		// y = (sum2 - sum1)/2 +x

		HashMap<Integer, Integer> map = new HashMap<>();
		int sum1 = 0, sum2 = 0;
		for (int i : a)
			sum1 = sum1 + i;

		for (int i : b) {
			sum2 = sum2 + i;
			map.put(i, 0);
		}

		diff = (sum2 - sum1) / 2;

		for (int i : a) {
			if (map.containsKey(diff + i)) {
				a[0] = i;
				a[1] = diff + i;
			}

		}

		System.out.println(a[0]);
		System.out.println(a[1]);

	}

}

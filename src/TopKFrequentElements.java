import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=UoqKvA5Qsek
		int nums[] = { 1, 1, 1, 2, 2, 3, 7, 8, 5, 6, 5, 5, 9, 5, 7, 5, 5, 10, 10, 10, 10 };
		int k = 2;
		int max = Integer.MIN_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[k];
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			max = Math.max(max, map.get(nums[i]));
		}

		// Here temp is an array of arraylist having
		// n number of rows.The number of columns on
		// each row depends on the user.
		// temp[i].size() will give the size of the
		// i'th row
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] temp = new ArrayList[max + 1];
		for (int i : map.keySet()) {
			int freq = map.get(i);
			if (temp[freq] == null)
				temp[freq] = new ArrayList<>();
			temp[freq].add(i);
		}

		for (int i = temp.length - 1; i >= 0; i--) {
			if (temp[i] != null) {
				for (int j : temp[i]) {
					res[count] = j;
					count++;
					if (count == k)
						System.exit(0);
				}

			}
		}

		// output array
		for (int i = 0; i <k; i++)
			System.out.println(res[i]);
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BrickWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list = { { 1, 2, 2, 1 }, { 3, 1, 2 }, { 1, 3, 2 }, { 2, 4 }, { 3, 1, 2 }, { 1, 3, 1, 1 } };
		List<List<Integer>> wall = new ArrayList<List<Integer>>();
		for (int i = 0; i < list.length; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0; j < list[i].length; j++) {
				temp.add(list[i][j]);
			}
			wall.add(temp);
		}

		int max = Integer.MIN_VALUE;
		int sum = 0;
		int n = wall.size();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < wall.get(i).size() - 1; j++) {
				sum = sum + wall.get(i).get(j);
				map.put(sum, map.getOrDefault(sum, 0) + 1);
				max = Math.max(max, map.get(sum));
			}
			sum = 0;
		}

		if (max < 0)
			System.out.println(n);
		else
			System.out.println(n - max);
		

		System.out.println(n - max);
		System.out.println(map);
		System.out.println(max);

	}

}

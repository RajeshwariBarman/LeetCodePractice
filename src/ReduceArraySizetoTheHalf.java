import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceArraySizetoTheHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1000, 1000, 3, 7 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		System.out.println(map);

		Map<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));

		System.out.println(sortedMap);
		int n = arr.length;
		int res = arr.length / 2;
		int count = 0;
		for (Integer i : sortedMap.values()) {
			n = n - i;
			if (n > res) {
				count++;
			}
		}
		count++;
		System.out.println(count);

	}

}

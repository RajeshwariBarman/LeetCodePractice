import java.util.HashMap;
import java.util.TreeSet;

public class AvoidFloodInCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] rains = { 1, 0, 3, 0, 1, 3 };
		int[] rains = {69,0,0,0,69};
		int n = rains.length;
		int[] res = new int[n];
		Integer dryday;
		// storing the rain day with pond no
		HashMap<Integer, Integer> map = new HashMap<>();
		// storing the position of zeros
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			if (rains[i] == 0) {
				set.add(i);
				res[i] = 1;
			}else {
				if (map.containsKey(rains[i])) {
					dryday = set.ceiling(map.get(rains[i]));
					if (dryday == null)
						System.out.println("not possible");
					else {
						res[dryday] = rains[i];
						set.remove(dryday);
					}

				}
				map.put(rains[i], i);
				res[i] = -1;
			}
		}
		
		for(int i = 0 ; i<n ; i++)
		{
			System.out.print(res[i] +" ");
		}

	}

}

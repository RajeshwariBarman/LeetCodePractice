import java.util.ArrayList;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = { 0, 2, 4, 5, 6, 7, 11 };
		int nums[] = {0,2,3,4,6,8,9};
			int windowstart = 0;
			int n = nums.length;
			boolean flag = true;
			ArrayList<String> res = new ArrayList<>();
			for (int windowend = 0; windowend < n - 1; windowend++) {
				if (nums[windowend] + 1 == nums[windowend + 1]) {
					if (windowend + 1 == n - 1) {
						res.add("\"" + nums[windowstart] + "->" + nums[windowend+1] + "\"");
						flag = false;
					}
					continue;
				}
	
				else {
					if (windowend - windowstart == 0)
						res.add("\"" + nums[windowend] + "\"");
					else
						res.add("\"" + nums[windowstart] + "->" + nums[windowend] + "\"");
					windowstart = windowend + 1;
				}
	
			}
	
			if (flag)
				res.add("\"" + nums[n - 1] + "\"");
		System.out.println(res);
	}

}

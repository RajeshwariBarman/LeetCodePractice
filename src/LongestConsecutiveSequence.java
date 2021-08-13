import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 0, 1, 2, 3, 3, 100, 100, 40, 500, 501, 502, 503, 500, 500, 504, 505 };
		// 0,1,1,2
		// used sliding window
//		Arrays.sort(nums);
//		int start = 0, end;
//		int count = 0;
		int maxlen = Integer.MIN_VALUE;
//		for (end = 0; end < nums.length - 1; end++) {
//			if (nums[end] == nums[end + 1]) {
//				count++;
//				continue;
//			}
//			if (nums[end] + 1 != nums[end + 1]) {
//				maxlen = Math.max(maxlen, end - start + 1 - count);
//				start = end + 1;
//				count = 0;
//			}
//
//		}
//		maxlen = Math.max(maxlen, end - start + 1 - count);
//		System.out.println(count);
//		System.out.println(maxlen);

		HashSet<Integer> set = new HashSet<Integer>();
		int currmax = 1;
		for (int i : nums)
			set.add(i);

		for (int i : set) {
			int currnum = i;
			if(!set.contains(i-1))
			{
				while (true) {
					if (set.contains(currnum + 1)) {
						currmax++;
						currnum++;
					} else
						break;
				}
				
				maxlen = Math.max(maxlen, currmax);
				currmax = 1;
			}

		}
		
		System.out.println(maxlen);
	}

}

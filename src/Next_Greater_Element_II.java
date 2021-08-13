import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1 };
		int n = nums.length;
//		for (int i = 0; i < n; i++) {
//			int max = nums[i];
//			for (int j = i + 1; j < n + j; j++) {
//				if (max < nums[j % n]) {
//					max = nums[j % n];
//					break;
//				}
//			}
//			if (nums[i] >= max)
//				nums[i] = -1;
//			else
//				nums[i] = max;
//		}
//
//		for (int i = 0; i < n; i++)
//			System.out.println(nums[i]);

		int[] temparr = new int[n];
		Arrays.fill(temparr, -1);
		Stack<Integer> s1 = new Stack<Integer>();
		for (int i = 0; i < 2 * n; i++) {
			while (!s1.isEmpty() && nums[s1.peek()] < nums[i % n]) {

				temparr[s1.peek()] = nums[i % n];
				s1.pop();
			}

			if (i < n)
				s1.push(i);
			//System.out.println(nums[s1.peek()]);
		}

		for(int i = 0 ; i< temparr.length ;i++)
		{
			System.out.println(temparr[i]);
		}

	}

}

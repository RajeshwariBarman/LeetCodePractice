
public class IncreasingTripletSubsequence {

	public static void main(String[] args) {

		// Best solution:
		int[] nums = { 1, 0, 1, 1, 1, 1, 0, -1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= first)
				first = nums[i];
			else if (nums[i] <= second)
				second = nums[i];
			else
				System.out.println("True");
		}

		// TODO Auto-generated method stub
		// int[] nums = { 1, 2, 3, 1, 2, 1 };
		// //int[] nums = { 2, 1, 5, 0, 4, 6 };
		//// int[] nums =
		// {0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,100000000};
		//// int[] nums = {1,1,1,1,1,3,0,0,8};
		//// int[] nums =
		// {0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100000000};
		// int[] nums = {1,0,1,1,1,1,0,-1,1,1,1,1,1,1,1,1,2};
		// boolean flag = false;
		// int first = Integer.MAX_VALUE;
		// int second = Integer.MAX_VALUE;
		// int third = Integer.MAX_VALUE;
		// int i = 0, j = 0, l = 0;
		// for (int k = 0; k < nums.length; k++) {
		// if (first > nums[k]) {
		// first = nums[k];
		// i = k;
		// j = 0;
		// l = 0;
		// System.out.println("i "+i);
		// System.out.println("first "+first);
		// } else if ((second >= nums[k]) && (first != nums[k])) {
		// second = nums[k];
		// j = k;
		// System.out.println("j "+j);
		// System.out.println("second "+second);
		// } else if ((third >= nums[k]) && (first != nums[k]) && (second !=
		// nums[k])) {
		// third = nums[k];
		// l = k;
		// }
		// if((first<second) &&(second<third) && (i<j) &&(j<l))
		// {
		// flag = true;
		// break;
		// }
		// }
		//
		// System.out.println(flag);

	}

}

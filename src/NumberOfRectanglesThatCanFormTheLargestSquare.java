
public class NumberOfRectanglesThatCanFormTheLargestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = Integer.MIN_VALUE;
		int[][] nums = { { 5, 8 }, { 3, 9 }, { 5, 12 }, { 16, 5 },{ 16, 17} };
		for (int i = 0; i < nums.length; i++) {

			if (max < Math.min(nums[i][0], nums[i][1])) {
				max = Math.min(nums[i][0], nums[i][1]);
				count = 1;
			} else if (max == Math.min(nums[i][0], nums[i][1]))
				count++;
		}
		
		System.out.println(count);

	}

}

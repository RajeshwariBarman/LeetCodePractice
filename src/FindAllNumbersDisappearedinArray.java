import java.util.ArrayList;

public class FindAllNumbersDisappearedinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i])-1;
			nums[index] = -(Math.abs(nums[index]));

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i+1);
			}

		}
		
		System.out.println(list);

	}

}

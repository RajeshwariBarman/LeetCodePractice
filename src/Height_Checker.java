import java.util.Arrays;

public class Height_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 4, 2, 1, 3 };
		int[] exp = nums.clone();
		Arrays.sort(exp);
		int count = 0;

		for (int i = 0; i < exp.length; i++) {
			if (nums[i] != exp[i])
				count++;
		}
		
		System.out.println(count);
	}

}

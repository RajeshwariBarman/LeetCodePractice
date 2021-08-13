
public class Replace_Elements_with_Greatest_Element_on_Right_Side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 17, 18, 5, 4, 6, 1 };
		int max = Integer.MIN_VALUE;
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				index = i;
				max = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length-1)
				nums[i] = -1;
			else if (nums[i] < max && i < index)
				nums[i] = max;
			else {
				max = Integer.MIN_VALUE;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] > max) {
						index = j;
						max = nums[j];
					}
				}

				nums[i] = max;
			}
		}
		
		
		for(int i = 0 ; i< nums.length ;i++)
			System.out.println(nums[i]);

	}

}


public class Second_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = { 2, 2, 3, 3, 3, 1, -9, 4, 0, 4, 4, 10 };
		
		int nums[] = {1,2,-2147483648};
//		int first = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		int third = Integer.MIN_VALUE;
//		int index = 0 ;
//		for (int i = 0; i < nums.length; i++) {
//			if (first < nums[i]) {
//				third = second;
//				second = first;
//				first = nums[i];
//			} else if (first > nums[i] && second <nums[i]) {
//				third = second;
//				second = nums[i];
//			} else if (first > nums[i] && second > nums[i] && nums[i] >third)
//			{
//				third = nums[i];
//			}
//			
//			if(nums[i] == Integer.MIN_VALUE)
//				index  = i;
//				
//		}
		
		Integer first = null;
		Integer second = null;
		Integer third = null;
		int index = 0 ;
		for (int i = 0; i < nums.length; i++) {
			if (first == null ||first < nums[i]) {
				third = second;
				second = first;
				first = nums[i];
			} else if (second == null  || first > nums[i] && second <nums[i]) {
				third = second;
				second = nums[i];
			} else if (third == null || first > nums[i] && second > nums[i] && nums[i] >third)
			{
				third = nums[i];
			}
			
				
		}

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}

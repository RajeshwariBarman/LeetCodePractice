
public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 1, 2, 3, 4 };
//		int[] left = new int[nums.length];
//		int[] right = new int[nums.length];
//		int i = 0, j = nums.length - 1;
//		while (i < nums.length && j >= 0) {
//			if (i == 0 && j == nums.length - 1) {
//				left[i] = nums[i];
//				right[j] = nums[j];
//			} else {
//				left[i] = left[i - 1] * nums[i];
//				right[j] = nums[j] * right[j + 1];
//			}
//			i++;
//			j--;
//		}
//
//		for (int k = 0; k < nums.length; k++) {
//			if (k == 0)
//				nums[k] = right[k + 1];
//			else if (k == nums.length - 1)
//				nums[k] = left[k - 1];
//			else
//				nums[k] = left[k - 1] * right[k + 1];
//
//		}
//		
//		for(Integer k : nums)
//			System.out.println(k);
		


	        String s[] = "   i   like this program     very much    ".
	                                        split(" ");
	        String ans = "";
	        for (int i = s.length - 1; i >= 0; i--)
	        {
	            ans += s[i] + " ";
	        }
//	        System.out.println("Reversed String:");
//	        System.out.println(ans.substring(0,
//	                                  ans.length() - 1));
	        
	        
	        for(String k : s)
	        	System.out.println(k);
	    

	}

}

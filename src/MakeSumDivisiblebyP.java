
public class MakeSumDivisiblebyP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {26,19,11,14,18,4,7,1,30,23,19,8,10,6,26,3};
		int p = 26;
		long sum = 0;	
		boolean flag = false;
		for (int i = 0; i < nums.length; i++)
			sum = sum + nums[i];

		System.out.println(sum%26);
		if (sum < p)
			System.out.println("not possible");
		else {
			int r = (int) (sum % p);
			int start = 0;
			int len = Integer.MAX_VALUE;
			sum = 0;
			for (int end = 0; end < nums.length; end++) {
				sum = sum + nums[end];
				while (sum >= r && start <= end) {
					if (sum == r)
					{
						len = Math.min(len, end - start + 1);
						flag  = true;
					}						
					sum = sum - nums[start];
					start++;
				}

			}

			System.out.println(len);

		}

	}

}

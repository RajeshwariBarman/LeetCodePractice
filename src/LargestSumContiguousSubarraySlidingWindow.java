
public class LargestSumContiguousSubarraySlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -10,-10,-8};
		// int[] arr = {-2, -3, -4, -1, -2, -1, -9};

		// int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 };
		// use only Kaden's algo
		int max = Integer.MIN_VALUE;
		int currentmax = 0;
		
		for(int i = 0 ;i<arr.length;i++)
		{
			currentmax = currentmax + arr[i];
			max = 	Math.max(currentmax, max);
			if(currentmax<0)
				currentmax = 0;
		}

		System.out.println(max);
	}

}

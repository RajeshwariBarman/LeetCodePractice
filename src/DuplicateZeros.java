
public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = nums.length - 2; j >= i; j--) {
					nums[j + 1] = nums[j];
				}
				i++;
			}
		}

//		for (int i : nums)
//			System.out.print(i + " ");
		
		DuplicateZeros s1 = new DuplicateZeros();
		s1.solve();

	}

	void solve() {
		//int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int[] nums = {8,4,5,0,0,0,0,7};
		int count = 0, last_index = 0, length = nums.length;
		int i = 0;		
		for (i = 0; i < nums.length && length > 0; i++) {
			if (nums[i] == 0) {
				length = length - 2;
				if(length>=0)
					count++;
			} else
				length--;
		}
		last_index = i-1;
		System.out.println(last_index);
		System.out.println(count);
		boolean flag  = false;
		if(nums[last_index] == 0 && length<0)
			flag = true ;		
		for(int k = last_index ;k>=0 && count>0;k--)
		{
			if(nums[k] != 0 || flag == true)
			{
				nums[k+count] = nums[k];
				flag = false;
			}
			else
			{
				nums[k+count] = nums[k];
				nums[k+count-1] = nums[k];
				count--;
			}
		}
		
		for (int j : nums)
			System.out.print(j + " ");
	}

}

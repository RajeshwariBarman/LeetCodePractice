
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] != val)
			{
				nums[count] = nums[i];
				count++;
			}

		}
		
		System.out.println(count);

	}

}

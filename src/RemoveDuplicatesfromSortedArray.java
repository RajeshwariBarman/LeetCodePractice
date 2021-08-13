
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; 
		int j = 0;
		
		for(int i = 0 ; i<nums.length-1;i++)
		{
			if(nums[i] != nums[i+1])
			{
				nums[j] = nums[i];
				j++;
			}
		}
		nums[j] = nums[nums.length-1];
		j++;
		System.out.println(j);

	}

}

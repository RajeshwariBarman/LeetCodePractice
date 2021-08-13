import java.util.ArrayList;

public class FindAllDuplicatesinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i<nums.length;i++)
		{
			int index = Math.abs(nums[i]) -1;
			if(nums[index]<0)
			{
				list.add(Math.abs(nums[i]));
			}else
			{
				nums[index] = -nums[index];
			}
		}
		
		System.out.print(list);
	}

}

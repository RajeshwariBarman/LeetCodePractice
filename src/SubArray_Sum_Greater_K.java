import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubArray_Sum_Greater_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,3,4};
		int k = 4;
		int count = 0 , sum = 0;
		int i=0;
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for(int end = 0 ; end < arr.length;end++)
		{
			sum = sum + arr[end];
			list.add(arr[end]);
			if(sum>=k)
			{
				if(!set.contains(list))
				{
					set.add(new ArrayList<Integer>(list));
					count++;
					int temp = sum; 
					List<Integer> templist = new ArrayList<Integer>(list);
					while(temp>=k && i<=end)
					{
						if(!set.contains(templist))
						{
							count++;
							set.add(new ArrayList<Integer>(templist));
						}
							
						temp = temp - arr[i];
						i++;
						templist.remove(0);
					}
				}
				
				i = 0;
			}
			
		}
		
		System.out.println(count);
		System.out.println(set);
		

	}

}

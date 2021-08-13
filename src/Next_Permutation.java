import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Next_Permutation {
	
	static boolean flag = false;
	static 	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {6,2,1,5,4,3,0};
		int[] arr = {5,4,7,5,3,2};
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 0 ; i< arr.length ;i++)
//			list.add(arr[i]);
//		List<Integer> sorted = new ArrayList<Integer>(list);
//		Collections.sort(sorted);
//		Collections.reverse(sorted);
//		if(sorted.equals(list))
//		{
//			Collections.sort(sorted);
//			System.out.println(sorted);
//		}
//		else
//		{
//			Collections.sort(sorted);
//			solve(sorted,new ArrayList<Integer>(),list);
//		}
		
		Next_Permutation s1 = new Next_Permutation();
		s1.permutation(arr);
		

	}
	
	public static void solve(List<Integer> input,List<Integer> output,List<Integer> expected )
	{
		if(input.size() == 0)
		{
			res.add(new ArrayList<Integer>(output));
			if(flag == true)
			{
				System.out.println(output);		
				flag = false;
				//System.exit(0);
			}				
			if(output.equals(expected))
			{
				flag = true;
			}	
		}
			
		for(int i = 0 ; i< input.size();i++)
		{
			output.add(input.get(i));
			List<Integer>tempinput = new ArrayList<Integer>(input);
			tempinput.remove(i);
			solve(tempinput,output,expected);
			output.remove(output.size()-1);
		}
	}
	
	void permutation(int[] arr)
	{
		//finding the index to swap 
		int i;
		for( i = arr.length-1 ; i>0 ;i--)
		{
			if(arr[i-1]>=arr[i])
				continue;
			else
				break;
		}
		if(i == 0)
			Arrays.sort(arr);
		else
		{
			int swapindex = 0;
			int firstnum = i-1;
			
			for(int j = i ; j< arr.length;j++)
			{
				System.out.println();
				if((arr[j] - arr[firstnum])>0)
					swapindex = j;
				else
					break;
			}
			System.out.println("fnum= "+arr[firstnum]);
			System.out.println("snum= "+arr[swapindex]);
			int temp = arr[firstnum];
			arr[firstnum] = arr[swapindex];
			arr[swapindex] = temp;		
			for(int k = 0 ; k<  arr.length ;k++)
				System.out.print(arr[k] +" ");
			int n = arr.length;
			int count  = 0 ;
			for(int start = i ; count < (n-i)/2;start++)
			{
				temp = arr[start];
				arr[start] = arr[n-count-1];
				arr[n-count-1] = temp;
				count++;
			}
			
			System.out.println();
		}

		
		for(int k = 0 ; k<  arr.length ;k++)
			System.out.print(arr[k] +" ");
	}

}

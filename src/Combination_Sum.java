import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,2,3,6,7};
		int target = 7;
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		solve(arr,0, target, 0, s1,res);
		System.out.println(res.toString());

	}

	public static void solve(int[] arr, int sum, int target, int count, ArrayList<Integer> res,ArrayList<ArrayList<Integer>> res1) {
		
		if (sum > target)
			return;
		if (target == sum) {
			res1.add(new ArrayList<Integer>(res));
			System.out.println("OUTPUT=" + res);
			return;
		}

		for (int i = count; i < arr.length; i++) {
			sum = sum + arr[i];
			ArrayList<Integer> temp = new ArrayList<Integer>(res);
			temp.add(arr[i]);
			solve(arr, sum , target,i,temp,res1);
			sum = sum - arr[i];
		}
//		for (int i = count; i < arr.length; i++) {
//			if (sum < target) {
//				res.add(arr[i]);
//				solve(arr, sum + arr[i], target, i, res,res1);
//			}
//			else if (sum > target)
//			{
//				res.remove(res.size()-1);
//				return;
//			}
//				
//			else if (sum == target) {
////				System.out.println(res.toString());
//				res1.add(new ArrayList<Integer>(res));
////				System.out.println(res1);
//				res.remove(res.size()-1);
//				return;
//			}
//		}
//		if(res.size() != 0)
//		  res.remove(res.size()-1);
//		return;
	}

}

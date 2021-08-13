
public class Jump_Game_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,3,0,3,1,2};
		boolean[] visited  = new boolean[arr.length];
		System.out.println(solve(arr, 5,visited));

	}

	static boolean solve(int[] arr, int index,boolean[] visit) {
		if ((index>= arr.length) || (index < 0) || (visit[index] == true))
			return false;
		if (arr[index] == 0) {
			visit[index] = true;
			return true;
		}
		visit[index] = true;
		System.out.println(index);
		return (solve(arr, index + arr[index],visit) || solve(arr, index - arr[index],visit));

	}

}

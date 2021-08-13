
public class MinimumNumberofOperationstoMoveAllBallstoEachBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "001011";
		int[] res = new int[s.length()];
		int countleft = 0, countright = 0;

//		for(int i = 0 ; i<s.length();i++)
//		{
//			for(int j = 0;j<s.length();j++)
//			{
//				char c = s.charAt(j);
//				if(c == '1')
//				{
//					res[i] = res[i] + Math.abs(i-j);
//				}
//			}
//		}

		/*
		 * first find the total weight of the left most element in the array and then
		 * from there minus the no of 1s on the right of the element and add the 1s in
		 * the right https://www.youtube.com/watch?v=TjedLBZbqmM
		 */

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '1') {
				res[0] = res[0] + Math.abs(i - 0);
				countright++;
			}

		}
		if (s.charAt(0) == '1') {
			countright--;
			countleft++;
		}

		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			res[i] = res[i - 1] + countleft - countright;
			if (c == '1') {
				countright--;
				countleft++;
			}

		}

		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);

	}

}

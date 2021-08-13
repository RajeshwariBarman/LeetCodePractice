
public class FindNumberswithEvenNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 12, 345, 2, 6, 7896 };
		int count = 0, evencount = 0;
		for (int i : nums) {
			while (i > 0) {

				i = i / 10;
				count++;
			}

			if(count%2 == 0)
				evencount++;
			count = 0;
		}
		System.out.println(evencount);
	}

}

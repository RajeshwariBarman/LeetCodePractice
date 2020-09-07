
public class MaximumDistanceToClosestPerson {

	public static void main(String[] args) {
		// int[] a = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
//		int[] a = { 1, 0, 0, 1 };
		int[]a = {0,1,1,1,0,0,1,0,0};
		int max_sum = Integer.MIN_VALUE;
		int count = 0, start_sum = 0, end_sum = 0;
		boolean start = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0 && i == 0)
				start = true;
			if (a[i] == 0 && i == a.length - 1)
				end_sum = count + 1;

			if (a[i] == 0) {
				count++;
				if (max_sum < count)
					max_sum = count;
			} else {
				if (start) {
					start_sum = count;
					start = false;
				}
				count = 0;
			}
		}

		System.out.println("Mx sum "+max_sum);
		System.out.println("end sum "+end_sum);
		System.out.println("start sum "+start_sum);
		if (max_sum % 2 == 0) {
			if (start_sum >((max_sum / 2)))
				System.out.print("start_sum =" + start_sum);
			else if (end_sum >((max_sum / 2)))
				System.out.print("End sum =" + end_sum);
			else
				System.out.print("max_sum =" + ((max_sum / 2)));
		} else {
			if (start_sum >((max_sum / 2) + 1))
				System.out.print("max_sum =" + start_sum);
			else if (end_sum >((max_sum / 2) + 1))
				System.out.print("max_sum =" + end_sum);
			else
				System.out.print("max_sum =" + ((max_sum / 2) + 1));
		}

	}

}

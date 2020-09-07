
public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		int count = 1;
		int n = nums.length;
		if (n == 0)
			System.out.println(0);
		boolean flag = true;
		for (int current = 1; current < n; current++) {
			if (nums[current - 1] != nums[current]) {
				nums[count] = nums[current];
				count++;
				flag = true;
			} else {
				if (flag) {
					nums[count] = nums[current];
					count++;
					flag = false;
				}
			}
		}

		for (int i = 0; i < count; i++)
			System.out.print(nums[i] + " ");

	}

}

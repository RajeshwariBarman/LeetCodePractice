
public class BuyShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it can decrease by $1
		// increase by double

		int initial = 3;
		int target = 4;
		int count = 0;
		int count1 = 0;
		int temp = initial;
		if (initial > target)
			count = initial - target;
		else {
			while (temp < target) {
				temp = temp * 2;
				count++;
			}
			count = count + (temp - target);
			temp = initial;
			while (temp != target) {
				temp = temp - 1;
				temp = temp * 2;
				count1 = count1 + 2;
			}
			
			count = Math.min(count1, count);
		}

		System.out.println(count);

	}

}

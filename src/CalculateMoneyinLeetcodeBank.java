
public class CalculateMoneyinLeetcodeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20	;
		int rem = n%7;
		int weeks = n/7;
		int sum = 0;
		if(weeks>0)
		{
			sum = 28;
			int i = 1;
			while(i<weeks)
			{
				sum = sum + 28 + 7*i;
				i++;
			}
			if(rem>0)
			{
				int remsum = (rem *(rem +1))/2;
				sum = sum + remsum + rem*i;
			}
		}
		else
		{
			sum = (n * (n+1))/2;
		}
		
		
		
		System.out.println(sum);

	}

}

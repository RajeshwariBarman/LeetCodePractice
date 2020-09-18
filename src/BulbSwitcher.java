

public class BulbSwitcher {

	/*
	 * Logic for the problem 1. Any no , which are not perfect square will have
	 * odd no of factors excluding 1 & including the no itself 
	 * 24 - 2 , 3, 4 ,6 , 8, 12 , 24 (total odd no occurrence , so the final state will be off)
	 * 25 - 5 , 25 (even no occurrence so final state will be on)
	 * So we need to find the total no of perfect square in n & that many no of ON will be there plus 1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 99999;
		int count = 1;
		if(n == 0)
			System.out.println(0);
//		System.exit(0);
//		for (long i = 2; i <= n/2; i++) {
//			if (i * i <= n)
//			{
//				System.out.println(i*i);
//				count++;
//			}
//				
//		}
		
		System.out.println(Math.sqrt(30));

		System.out.println(count);

	}

}

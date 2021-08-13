
public class Add_Two_Numbers_Without_plus_Sign {

	//371. Sum of Two Integers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -5;
		int b = 2;
		
		while(b!=0)
		{
			int carry = a & b;
			a = a ^ b;
			b = carry<<1;
			
		}
		
		System.out.println(a);

	}

}

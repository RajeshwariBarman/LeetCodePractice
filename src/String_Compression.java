
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c' };
		int count = 0, start = 0;
	//	StringBuilder s = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			System.out.println(count);
			if (i < c.length - 1) {
				if ((c[i] == c[i + 1])) {
					count++;
				} else {
					if (count == 0)
					{
						c[start] = c[i];
						start++;
					}
  				  else {                     
  					  count++;
  					  c[start++] = c[i];
  					  for(char a: ("" + (count)).toCharArray())
  					  {
  						  c[start++] = a;
  					  }
  					  
					}
					count = 0;
				}
			}
		}
		if (count == 0)
			c[start++] = c[c.length-1];
		else {
			count++;
			  c[start++] = c[c.length-1];
			  for(char a: ("" + (count)).toCharArray())
			  {
				  c[start++] = a;
			  }
			  
		}

		for(int i = 0 ; i< c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.print(start);

	}

}

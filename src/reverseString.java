
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'h', 'e', 'l', 'l', 'o' };
		reverse(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	static void reverse(char[] arr, int start, int end) {

		if (start >= end)
			return;		
		   char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		
		reverse(arr, start + 1, end - 1);

	}

}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maximum_Length_of_Concatenated_String_with_Unique_Characters {
	
	private int ans = 0;
	public static void main(String[] args)
	{
		Maximum_Length_of_Concatenated_String_with_Unique_Characters s1 = new Maximum_Length_of_Concatenated_String_with_Unique_Characters();
		System.out.println(s1.maxLength());
	}

	public int maxLength(){
		// start from each word in arr
		
		List<String> arr1  = new ArrayList<String>();
		arr1.add("a");
		arr1.add("abc");
		arr1.add("d");
		arr1.add("de");	
		arr1.add("def");	
		helper(arr1, 0, 0, new HashMap<>());
//		for(int i = 0; i < arr.size(); i++)
//			helper(arr, i, 0, new HashMap<>());
		return ans;
	}

	private void helper(List<String> arr, int index, int res, Map<Character, Integer> used){

		for(int i = index ; i < arr.size(); i++){
			String cur = arr.get(index);
			System.out.println("curr = "+cur);
			// put all the character in a hashmap
			for(int j = 0; j < cur.length(); j++){
				used.put(cur.charAt(j), used.getOrDefault(cur.charAt(j), 0) + 1);
			}
			// if value of certain character > 1, means duplicate
			for(int j: used.values()){
				if(j > 1)
					return;
			}
			// update result
			res += cur.length();
			ans = Math.max(ans, res);
			helper(arr, i+1, res, used);
			// backtrack the hashmap
			for(int j = arr.get(i).length() - 1; j >= 0; j--){
				used.put(arr.get(i).charAt(j), used.get(arr.get(i).charAt(j)) - 1);
			}
		}
	}
	

}

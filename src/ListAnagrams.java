import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "cat", "dog", "tac", "god", "act" };
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0 ; i< str.length;i++)
		{
            String s = str[i];
			char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
 
            // calculate hashcode of string
            // after sorting
            if (map.containsKey(newWord)) {
                map.get(newWord).add(s);
            }
            else {
 
                // This is the first time we are
                // adding a word for a specific
                // hashcode
                List<String> words = new ArrayList<>();
                words.add(s);
                map.put(newWord, words);
            }
		}
		
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                res.add(values.get(0));
            }
        }
        
        System.out.println(res);
        
	}

}


import java.io.*;
import java.lang.*;
import java.util.*;

//https://www.geeksforgeeks.org/smallest-substring-occurring-only-once-in-a-given-string/

public class smallestSubstring {

	// Function to find the smallest
	// substring occurring only once
	static int smallestSubstring(String a) {

		// Stores all occurences
		ArrayList<Integer> a1 = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		// Generate all the substrings
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j <= a.length(); j++) {
				map.put(a.substring(i, j), map.getOrDefault(a.substring(i, j), 0) + 1);
				// Avoid multiple occurences
			}
		}

		// Take into account
		// all the substrings


		// Iterate over all
		// unique substrings
		for (String s : map.keySet()) {

			// If frequency is 1
			if (map.get(s) == 1)

				// Append into fresh list
				a1.add(s.length());
		}

        a1.sort(null);

		// Return the minimum of dictionary
		return a1.get(0);
	}

	// Driver Code
	public static void main(String[] args) {
		String S = "zyzyzyz";

		System.out.println(smallestSubstring(S));
	}
}

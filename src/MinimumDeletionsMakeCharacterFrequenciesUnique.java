import java.util.Arrays;
import java.util.HashSet;

public class MinimumDeletionsMakeCharacterFrequenciesUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabc";
		int count = 0;
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c - 'a']++;
		}
		Arrays.sort(freq);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 0)
				continue;
			else {
				if (!set.contains(freq[i]))
					set.add(freq[i]);
				else {
					int val = freq[i];
					while (val > 0) {
						val--;
						if (val != 0) {
							if (!set.contains(val)) {
								set.add(val);
								count++;
								break;
							}
						}
						
						count++;

					}
				}
			}

		}
		
		System.out.println(count);

	}

}

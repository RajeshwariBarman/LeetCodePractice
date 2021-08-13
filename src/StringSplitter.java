import java.util.List;
import java.util.Set;

public interface StringSplitter {

	 

	  /**

	   * Splits the given string based on the separator(s).

	   *

	   * @param split      String to be split

	   * @param separators Separator to be used in the split

	   * @return Resulting list of substrings.

	   */

	  List<String> split(String split, Set<Separator> separators);

	}

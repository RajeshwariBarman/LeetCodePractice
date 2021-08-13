import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSplitting implements StringSplitter,Separator {
	
	private char c ;	
	public void set(char c)
	{
		this.c = c;
	}
	
	@Override
	public char get() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public List<String> split(String split, Set<Separator> separators) {
		// TODO Auto-generated method stub
		List<String> ressplits = new ArrayList<String>();
		String regex = "";	
		for(Separator sep : separators)
		   regex = regex+sep.get()+"|\\";
		System.out.println(regex);
		regex = regex.substring(0,regex.length()-2);
		String[] splits = split.split(regex);
		for(String s1 : splits)
		{
			if(s1.length()>0)
				ressplits.add(s1);
		}
		
		for(String s : ressplits)
			System.out.println(s);
		return ressplits;
		
		
	}
	
	
	public void stringsplit(String s)
	{
			
		Set<Separator> charset = new HashSet<Separator>();
        Separator s1 = new StringSplitting();
        ((StringSplitting) s1).set('_');
        charset.add(s1);
        Separator s2 = new StringSplitting();
        ((StringSplitting) s2).set('%');
        charset.add(s2);   
        split(s, charset);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSplitting s3 = new StringSplitting();
//		String s = "aa_b%%%%b_c_a";
		String s = "aa_";
		s3.stringsplit(s);	
		
	}


}

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 * @author Teddy
 * program implements a function that replaces all spaces in a string with a '%20'
 * This is another approach to implementing the UriString.java class on this repository
 * An ArrayList is used here
 * Any spaces before and after the target word/s are ignored
 */
public class UriStringUsingArrayList {

	public static void main(String[] args) 
	{
		System.out.print(replaceWhiteSpaces("  Mr John Smith  "));
	}
	
	public static String replaceWhiteSpaces(String str)
	{
		str = str.trim();
		ArrayList<Character> ls = new ArrayList<Character>();
		
		for(char c: str.toCharArray())
			ls.add(c);
		
		ListIterator<Character> it = ls.listIterator();
		
		while(it.hasNext())
		{
			if(it.next() == ' ')
			{
				it.set('%');
				it.add('2');
				it.add('0');
			}
		}
		
		String returnStr = "";
		
		for(char c: ls)
			returnStr += c;
		
		return returnStr;
	}

	
}

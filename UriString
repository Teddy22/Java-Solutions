/**
 * 
 * @author Teddy
 * program implements a function that replaces all spaces in a string with a '%20'
 * given the true length of the string, and also enough spaces provided at the end of the string
 * to fit in all white space replacements
 * Example: "Mr John Smith    " => The true length of this string is 13, but enough spaces have been accomodated to account
 * for the '%20' characters required.
 */
 
public class UriString 
{
	
	public static void main(String[] args) 
	{
		System.out.print(replaceWhiteSpaces("Mr John Smith    ", 13));
	}
	
	public static String replaceWhiteSpaces(String str, int trueLength)
	{
		char[] strArray = str.toCharArray();
		
		for(int i = 0; i < trueLength; i++) 
		{
			if(strArray[i] == ' ')
			{
				for(int j = str.length()-3; j > i; j--)
				{
					strArray[j+2] = strArray[j];
				}
				
				strArray[i] = '%';
				strArray[i+1] = '2';
				strArray[i+2] = '0';
				
				i += 2;
			}
		}
		
		String st = "";
		
		for(char c: strArray)
			st += c;
		
		return st;
	}
}

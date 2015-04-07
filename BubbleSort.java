import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Teddy
 * Generic bubble sort method
 * 
 * Worst Case Time: O(n^2)
 */

public class BubbleSort {
	
	private static final int NUMBER_OF_ITEMS = 25;
	private static final int MAX_NUMBER_GENERATED = 99;

	
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls = new ArrayList<Integer>();
		
		for(int i = 0; i < NUMBER_OF_ITEMS; i++)
			ls.add(new Random().nextInt(MAX_NUMBER_GENERATED+1));
		
		
		System.out.println(ls);
		bubbleSort(ls);
		System.out.println(ls);
		
	}
	
	
	public static <E extends Comparable<E>> void bubbleSort(List<E> ls)
	{
		boolean needNextPass = true;
		
		for(int i = 1; i < ls.size() && needNextPass; i++)
		{
			needNextPass = false;
			
			for(int j = 0; j < ls.size()-i; j++) 
			{
				if(ls.get(j).compareTo(ls.get(j+1)) == 1)
				{
					needNextPass = true;
					Collections.swap(ls, j, j+1);
				}
			}
						
		}
				
	}

}

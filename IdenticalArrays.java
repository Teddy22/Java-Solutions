import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays 
{
	static int[][] array1, array2;
	
	public static void main(String[] args) 
	{
		array1 = new int[3][3];
		array2 = new int[3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		
		while(keepGoing)
		{
			System.out.println("Enter your first n-by-n matrix row by row: ");
			
			// scan input and put into matrix 1
			for(int row = 0; row < array1.length; row++)
			{
				for(int column = 0; column < array1[row].length; column++)
				{
					array1[row][column] = scanner.nextInt();
				}
			}
			
			
			System.out.println("\nEnter your second n-by-n matrix: ");
			
			
			// scan input and put into matrix 2
			for(int row = 0; row < array2.length; row++)
			{
				for(int column = 0; column < array2[row].length; column++)
				{
					array2[row][column] = scanner.nextInt();
				}
			}
			
			
			boolean identical = equals(array1, array2);
			
			if(identical)
				System.out.println("\n\nThe two arrays are identical\n\n");
			else
				System.out.println("\n\nThe two arrays are not identical\n\n");
			
			
			System.out.print("\nWould you like to go again? ");
			System.out.println("");
			
			if(scanner.next().equalsIgnoreCase("No"))
				keepGoing = false;
		}
	}
	
	public static boolean equals(int[][] array1, int[][] array2)
	{
		if(array1.length != array2.length)
			return false;
		
		int[] arr1 = new int[array1.length*array1[0].length];
		int[] arr2 = new int[array2.length*array2[0].length];
		
		int index = 0;
		
		for(int row = 0; row < array1.length; row++)
		{
			if(array1[row].length != array2[row].length)
				return false;
			
			for(int column = 0; column < array1[row].length; column++)
			{
				arr1[index] = array1[row][column];
				arr2[index] = array2[row][column];
				index++;
			}
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
			return true;
		else
			return false;
	}

}

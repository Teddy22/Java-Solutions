import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ColumnSorting 
{
	static double[][] numbers;
	static double[] columnx;
	
	
	public static void main(String[] args) 
	{
		
		numbers = new double[3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		
		while(keepGoing)
		{
			System.out.println("Enter an n-by-n matrix row by row: ");
		
			// scan input and put into matrix
			for(int row = 0; row < numbers.length; row++)
			{
				for(int column = 0; column < numbers[row].length; column++)
				{
					numbers[row][column] = scanner.nextDouble();
				}
			}
			
			sortColumns(numbers);
			
			// display column-sorted matrix
			System.out.println("\nThe column-sorted array is: ");
			for(int row = 0; row < numbers.length; row++)
			{
				for(int column = 0; column < numbers[row].length; column++)
				{
					System.out.printf("%5.3f ", numbers[row][column]);
				}
				
				System.out.println("");
			}
			
			
			System.out.print("\nWould you like to go again? ");
			
			if(scanner.next().equalsIgnoreCase("no"))
				keepGoing = false;
		}
		
	}

	public static void sortColumns(double[][] numbers) 
	{
		columnx = new double[numbers[0].length];
		
		for(int column = 0; column < numbers[0].length; column++) // for each column
		{
			
			
			for(int row = 0; row < numbers.length; row++)
			{
				Array.set(columnx, row, numbers[row][column]);  // place column values in an array
				
			}
			
			Arrays.sort(columnx);  // sort the array of column values
			
			
			for(int row = 0; row < numbers.length; row++)  // place sorted array back into matrix as column
			{
				numbers[row][column] = columnx[row];
				
			}
			
			
		}
	}

}

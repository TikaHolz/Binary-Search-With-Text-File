import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class BinarySearchWithTextFile
	{

	public static void main(String[] args) throws IOException
		{
		//linking text file
		Scanner myFile = new Scanner(new File("RandomNumberInOrder.txt"));	
		//new array
		int [] fred = new int [5000];
		//make Fred contain the random number in order
		System.out.println(binarySearch(fred, 728));
		

		}
		//basic binary search algorithm
		public static int binarySearch(int[ ] elements, int target) throws IOException
			{     
			int left = 0;
			int right = elements.length - 1;
			while (left <= right) 
				{
				//divide by two
			     int mid = (left + right) / 2;
			     //when the target and elements equal each other, check the mid point
			     if (target == elements[mid]) 
			    	 {
			          return mid;
			          }
			    //when the target is less than the mid, subtract one from the mid
			    else if (target < elements[mid]) 
			    	{
			        right = mid - 1;
			        } 
			   //when the target is greater than the mid, add one from the mid
			    else 
			    	{
			         left = mid + 1;
			         }
			   }
			   return -1;
			}

	}

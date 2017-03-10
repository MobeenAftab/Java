package ctcI;

import java.util.*;

public class BinarySearch {
	
	//Binary search recursive
	public static int binarySearchRecursive(int[] array, int x, int left, int right) {
		int mid = left + ((right - left) / 2);

		if (left > right) {
			return (Integer) null ;	//System.out.println("Unsorted Array");
		}
		
		//If mid is the element to find
		if(array[mid] == x) {
			return x;
		} else if(x < array[mid]) {	//search left side
			return binarySearchRecursive(array, x, left, mid - 1);
		} else {	//search right side
			return binarySearchRecursive(array, x, mid + 1, right);
		}
		
	}
	
	//method to call binarySearchRecursive with correct parameters
	public static int binarySearchRecursive(int[] array, int x){
		return binarySearchRecursive(array, x, 0, array.length-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sortedList1[] = {1,2,3,4,5};
		int sortedList2[] = {10,20,30,40,50};
		int sortedList3[] = {100,200,300,400,500};
		int sortedLists[][] = {sortedList1, sortedList2, sortedList3};

	    System.out.println("Sorted lists: \n"+ Arrays.deepToString(sortedLists) + "\n");
	    
		System.out.println(binarySearchRecursive(sortedList1, 2));
		System.out.println(binarySearchRecursive(sortedList2, 20));
		System.out.println(binarySearchRecursive(sortedList3, 200));
		
	}

}

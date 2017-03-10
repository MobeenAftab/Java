package ctcI;

import java.util.*;


public class BubbleSort {

	public static void bubbleSort(int[] array) {
		boolean isSorted = false;
		int lastunsorted = array.length -1;
		int counter = 0;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastunsorted; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					counter++;
					isSorted = false;
				}
			}
			lastunsorted--;
		}
		System.out.println(Arrays.toString(array)+ " Sorted in: " + counter + " steps.");
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		int list1[] = {42,93,33,24,85};
		int list2[] = {60,10,40,50,30};
		int list3[] = {100,23,56,11,92};
		int list4[] = {235,746,457,875,123};
  		//int[] test = {1,3,2,4,5};
  		//bubbleSort(test);
		int lists[][] = {list1, list2, list3, list4};
		
	    System.out.println("Unsorted lists: \n"+ Arrays.deepToString(lists) + "\n");

		for(int i = 0; i < lists.length; i++) {
			bubbleSort(lists[i]);
		}
	}
}

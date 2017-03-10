package ctcI;

public class MergeSort {
	
	//recursive merge sort method helper
	public static void mergeSort(int[] array) {
		mergeSort(array, new int[array.length], 0, array.length -1);
		
	}
	
	//recursive method
	public static void mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd) {
		int mid = (leftStart + rightEnd) / 2;
		mergeSort(array, tempArray, leftStart, mid);	//sort left half to right
		mergeSort(array, tempArray, mid + 1, rightEnd);	//sort right half by mid + 1
		mergeSort(array, tempArray, leftStart, rightEnd);	//merge half from left start end right end
		
		if(leftStart >= rightEnd) {
			return;
		}
		 
	}
	
	//merge both halves
	public static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd +1;
		int size = rightEnd = leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		//copying over elements
		while(left <= leftEnd && right <= rightEnd) {
			if(array[left] <= array[right]) {	//copy left element
				tempArray[index] = array[left];
				left++;
			} else {	//copy over right element
				tempArray[index] = array[right];
				right++;
			}
			index++;
		}
		//copy remaining elements on left side
		System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);
		//copy remaining elements on right side
		System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);
		//copy back into main array
		System.arraycopy(tempArray, leftStart, array, leftStart, size);
	}

	public static void main(String[] args) {
		// TODO Change merge sort type to return int lists
		
		int[] list = {4,2,5,1};
		mergeSort(list);

	}

}

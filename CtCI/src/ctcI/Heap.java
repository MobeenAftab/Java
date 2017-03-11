package ctcI;

import java.util.*;

public class Heap {
	
	private int capacity = 10;
	private int size = 0;
	//Set size of item array to capacity
	int[] items = new int[capacity];
	//Methods to get left/right/parent index
	private int getLeftChildIndex(int parentIndex){ return 2 * parentIndex + 1;}
	private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2;}
	private int getParentIndex(int childIndex){ return 2 * (childIndex - 1) / 2;}
	//Check if they exist
	private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size;}
	private boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}
	private boolean hasParentChild(int index) {return getParentIndex(index) >= 0;}
	//Get the values in current index
	private int leftChild(int index) {return items[getLeftChildIndex(index)];}
	private int rightChild(int index) {return items[getRightChildIndex(index)];}
	private int parent(int index) {return items[getParentIndex(index)];}
	
	//Swap method to swap the value of two index
	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	//double size of items if maxed out space and copy over elements
	private void capacity(){
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *=2;
		}
	}
	//Start search, return first element at root
	public int peek(){
		if(size == 0) throw new IllegalStateException();
		return items[0];
	}
	//Extract minimum element from array
	public int poll() {
		if(size == 0) throw new IllegalStateException();
		int item = items[0];	//get element value
		items[0] = items[size - 1];
		size--;	//shrink array
		//heapiftDown(); TODO:: make shrink method
		return item;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

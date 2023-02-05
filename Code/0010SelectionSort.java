
 /*
    Problem Statement
    -----------------
    Given an array of size n, sort the array.
    Sorted form of the array is the non decreasing permutation of 
    the array. Use selection sort algorithm.
    
    Time Complexity  : 
    Space Complexity : 
    */

public SelectionSort{
  
	public static void selectionSort(int[] array) {

		int min, temp = 0;
		for (int i = 0; i < array.length; i++) {

			min = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min])
					min = j;

			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
  }
}

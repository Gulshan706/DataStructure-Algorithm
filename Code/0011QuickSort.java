 /*
    Problem Statement
    -----------------
    Given an array of size n, sort the array.
    Sorted form of the array is the non decreasing permutation of 
    the array. Use quick sort algorithm.
    
    Time Complexity  : 
    Space Complexity : 
    */

public class QuickSort{
  
	public static void quick(int array[], int start, int end) {

		int pi = partition(array, start, end);

		if (start < pi - 1)
			quick(array, start, pi - 1);

		if (pi < end)
			quick(array, pi + 1, end);
      
	}
  
      /*
    (Helper)
    -----------------
    Given an array of size n, an integer start and an integer end.Here partitioning of the element and take mid element as pivot.
    Rearrange the elements of the array between the start and end indices (both inclusive) 
    such that all the elements less than array[start] appear on the left of the array[start] and
    all the elements greater than array[start] appear on the right of the array[end].Doing so 
    makes array[start] come to a place where it would have been if the array was sorted between
    start and end indices including both.
    
    Time Complexity  : 
    Space Complexity : 
    */
  
	public static int partition(int array[], int start, int end) {

		int pivot = array[start+end/2];
		while (start <= end) {

			while (array[start] < pivot)
				start++;

			while (array[end] > pivot)
				end--;

			if (array[start] > array[end]) {

				int temp = array[end];

				array[end] = array[start];
				array[start] = temp;
				start++;
				end--;
			}
		}
		return start;
	}
}

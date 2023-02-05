 /*
    Problem Statement
    -----------------
    Given an array of size n, sort the array.
    Sorted form of the array is the non decreasing permutation of 
    the array. Use insertion sort algorithm.
    
    Time Complexity  : 
    Space Complexity : 
    */


	public static void insertionSort(int arr[]) {

		int temp, j;

		for (int i = 1; i < arr.length; i++) {

			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;

			}
			arr[j] = temp;

		}
	}

 /*
    Problem Statement
    -----------------
    Given an array of size n and an integer target, return
    another integer representing target element may be
    present and return false if it is not present in the array
    
    Time Complexity  : 
    Space Complexity : 
    */

public clas BinarySearch{
  
public static boolean binarySearch(int[] array, int target) {

		int low = 0, high = array.length;
		int mid = low + high / 2;
		boolean flag = false;
		while (low <= high)

			if (array[mid] == target)
				flag = true;

			else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		return flag;
  }
}


/*
    Problem Statement
    -----------------
    Given an array of size n and an integer target, return
    another integer representing target element may be
    present and -1 if it is not present in the array
    
    Time Complexity  : 
    Space Complexity : 
    
    Binary search through Recursion method
    */

public class BinarySearch {

public static int	binarySearch(int[] arr,int target){
		
	 return binarySearch(arr,target,0,arr.length-1);
	}
	public static int binarySearch(int[] arr,int target,int low,int high) {
		int mid =(low+high)/2;
		
		if(high<low) {
			return -1;
		}
		if(arr[mid]==target) {
			return mid;
		} else if(arr[mid]>target) {
		
			return binarySearch(arr,target,low,mid-1);
			
		}else {
			
		return binarySearch(arr, target, mid+1, high);
		}
	}
}



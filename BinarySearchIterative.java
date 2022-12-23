package com.gulshan.anyindex;

public class BinarySearchIterative {
//	Binary search through Iterative method
	public int binarySearch(int[] arr, int target) {
		
		int low=0,high=arr.length-1,mid;
		
		
		
		while(low<=high) {
			//Find mid of the array
			mid=(low+high)/2;
			
			System.out.println("Inside while loop : Low = "+low+" High = "+high+ " Mid = "+mid+ " Target = "+target);
			
			
			//Check if target present at mid
			if(arr[mid]==target) 
				return mid;
				
			
			//check if mid is less than target
			if(arr[mid]<target) 
				low=mid+1;
			else 
				high=mid-1; //mid is greater than target
				
			
			
		}
		
		
		return -1;
	}
	
}

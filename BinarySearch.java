package com.gulshan.anyindex;

public class BinarySearch {

//Binary search through Recursion method
public static int	binarySearch(int[] arr,int target){
		
	 return binarySearch(arr,target,0,arr.length-1);
	}
	public static int binarySearch(int[] arr,int target,int low,int high) {
		int mid =(low+high)/2;
		System.out.println("mid :"+mid);
		if(high<low) {
			return -1;
		}
		if(arr[mid]==target) {
			return mid;
		} else if(arr[mid]>target) {
			System.out.println("if mid is greater");
			return binarySearch(arr,target,low,mid-1);
			
		}else {
			System.out.println("else is executed");
		return binarySearch(arr, target, mid+1, high);
		}
	}
}

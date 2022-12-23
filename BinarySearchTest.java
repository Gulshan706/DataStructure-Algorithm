package com.gulshan.anyindex;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		//BinarySearch search=new BinarySearch();
		int[] arr= {1,2,5,7,9,11,23,34,56,77,88,98,100};
	//System.out.println(	"Result found at index number : "+search.binarySearch(arr, 56));
			
	//Iterative method
	BinarySearchIterative bst =new BinarySearchIterative();
	int result= bst.binarySearch(arr, 51);
	
	if(result!= -1) 
	System.out.println(	"Result found at index number : " +result);
	else
		System.out.println("Data does not exist in the array");
	
	

	}

}

package com.gulshan.array;

import java.util.*;

public class ReversArray {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4};

		System.out.println("Actual array is :" + Arrays.toString(array));
//		reverseArray(array);
//		System.out.println("Reverse array is :" +Arrays.toString(array));
//		reverseArrayBetweenStartAndEnd(array, 3, 7);
//		System.out.println("Reverse array is :" + Arrays.toString(array));
		
		int result=additionArrayOfTwoElement(array, 1);
		if(result>0)
			System.out.println("Sum of the two element in the existing array is equal to the Target " +result);
		else {
			System.out.println("Target not found");
		}
	}

	public static void reverseArray(int[] array) {

		int length = array.length;
		int temp = 0;

		for (int i = 0; i < length / 2; i++) {

			temp = array[i];
			array[i] = array[length - i - 1];
			array[length - i - 1] = temp;

		}

	}

	//Reverse Array between start and end
	public static void reverseArrayBetweenStartAndEnd(int[] array, int start, int end) {

		// 1,2,3,4,5,6,7,8,9

		int temp;

		int length = start + end;
		for (int i = 0; i < array.length; i++) {

			if (i == start) {
				for (int j = i; j < length / 2; j++) {
					temp = array[start++];
					array[j] = array[end];
					array[end--] = temp;

				}
				break;
			}

		}

	}
	
	// Sum of the two element in the existing array if is equal to target
	
	public static int additionArrayOfTwoElement(int[] array, int target) {
		int count=0;
	// Find the pair of the element in array
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]+array[j]==target) {
					 count++;
					 System.out.println("Pair of all the element : "+array[i]+" "+array[j]);
					
				}
				
			}
		}
		return count;
		
		
	}
	
	

}

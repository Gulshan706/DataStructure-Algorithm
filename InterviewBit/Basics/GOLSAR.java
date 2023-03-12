/*
Problem Description
 
Given two integer arrays A and B, and an integer C.
Find the number of integers in A which are greater than C and find the number of integers in B which are less than C.
Return maximum of these two values.

Problem Constraints
1 <= |A|, |B| <= 105
1 <= Ai, Bi, C <=109

*/

public int solve(int[] A, int[] B, int C) {
   
   int lesserCount, greaterCount;	
		greaterCount = findGreater(A, C);
        lesserCount = findLesser(B, C);
        if (lesserCount==0 && greaterCount==0)
        return 0;
	    else if (lesserCount > greaterCount)
			return lesserCount;
		else
			return greaterCount;
   
    }
public static int findGreater(int[] arr, int c) {

		int count = 0;
		for (int value : arr)
			if (value > c)
				count++;

		return count;
	}

public static int findLesser(int[] arr, int c) {

		int count = 0;
		for (int value : arr)
			if (value < c)
				count++;

		return count;
	}

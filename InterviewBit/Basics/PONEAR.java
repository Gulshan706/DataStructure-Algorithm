/*
Problem Description

Given an integer array A.
Find the number of positive and negative integers in it an return them in an array.

Problem Constraints

1 <= |A| <= 105
-109 <= Ai <= 109

Time  Complexity : 
Space Complexity : 

*/

public int[] solve(int[] array) {
       int positiveCount=0;
       int negativeCount=0; 
        for(int i:array)
        if(i>0)
        positiveCount++;
        else if(i<0)
        negativeCount++;
        
        int []positiveAndNegative=new int[2];
        positiveAndNegative[0]=positiveCount;
        positiveAndNegative[1]=negativeCount;
        
   return positiveAndNegative;
        
}

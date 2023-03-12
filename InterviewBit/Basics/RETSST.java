/*
Problem Description
 
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 
Problem Constraints
1 <= N <= 3 * 105

Time  Complexity : 
Space Complexity : 

*/

public String solve(String A) {
        String removeSpaces=removeExtraSpaces(A);
        return reversString(removeSpaces);
        
    }
public static String removeExtraSpaces(String str) {
		
		   str= str.trim();
	       return str.replaceAll("( )+", " ");
	}
public static String reversString(String str) {
		
		String word[]=str.split("\\s");
		
		String  result= "";
		
		for(int i=word.length-1;i>=0;i--) 
			result= result+word[i]+" ";
			
		return result.trim();
	}



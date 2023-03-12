/*
Problem Description
 
Given a string, determine if it is a palindrome. While checking for a palindrome, you have to ignore spaces, case, and all special characters; i.e. consider only alphanumeric characters.

Check the sample test case for reference.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Problem Constraints
1 <= |A| <= 106

Time  Complexity : 
Space Complexity : 

*/

public int isPalindrome(String sentence) {
       String word=removeSpecialChar(sentence);
       int length=word.length();  int result=0;
     
       result= checkPalindrome(word,length);
        if(result!=0)
        return result;
        else
        return result;
 } 

public static String removeSpecialChar(String sentence) {	
		return sentence.replaceAll("[^a-zA-Z0-9]","");				
	}

public static int checkPalindrome(String word,int length) {
		boolean flag=true;
		int l1=length-1;
		word=word.toLowerCase();
		for(int i=0;i<length;i++) 
			if(word.charAt(i)!=word.charAt(l1--))
				flag=false;
			
		if(flag) 
		    return 1;
		else 
		   return 0;
		
	}    

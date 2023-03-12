/*
Problem Description
 
Given a string A. Change the cases of all the characters.
If the character is lowercase convert it to uppercase and if the character is uppercase convert it to lowercase.

Note: All the characters in the string are latin uppercase or lowercase letters.

Problem Constraints
1 <= |A| <= 105

Time  Complexity : 
Space Complexity : 

*/

public String solve(String str) {
        String inversion="";
		char ch;
		for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
        
		if(Character.isUpperCase(ch))
		    inversion+=Character.toLowerCase(ch);
			
		else if(Character.isLowerCase(ch))
		    inversion+=Character.toUpperCase(ch);	
		
		}
	return inversion;
		
	}   

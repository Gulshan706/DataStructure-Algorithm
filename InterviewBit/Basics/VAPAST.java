/*
Problem Description
 
Given a password as a character array A.
Check if it is valid or not.
Password should have at least one numerical digit(0-9).
Password's length should be in between 8 to 15 characters.
Password should have at least one lowercase letter(a-z).
Password should have at least one uppercase letter(A-Z).
Password should have at least one special character ( @, #, %, &, !, $, *).

Problem Constraints
1 <= |A| <= 20

Time  Complexity :
Space Complexity :

*/

public int solve(String pass) {

		int length = pass.length();
		if (length >= 8 && length <= 15) 
			if (checkCharacter(pass, length))
			   return 1;
			else
				return 0;
		
		else 
          return 0;		
	}

public static boolean checkCharacter(String pass, int length) {

		int numericChar = 0, capitalChar = 0, smallChar = 0, specialChar = 0;
		char ch;
		for (int i = 0; i <= length-1; i++) {
			ch = pass.charAt(i);
			
			if (ch >= 48 && ch <= 57)
				numericChar++;
			if (ch >= 65 && ch <= 90)
				capitalChar++;
			if (ch >= 97 && ch <= 122)
				smallChar++;
			if ((ch >= 35 && ch <= 38) || ch==33 || ch==42 || ch==64)
				specialChar++;

		}

		if (numericChar >= 1 && capitalChar >= 1 && smallChar >= 1 && specialChar >= 1)
			return true;
		else
			return false;

	}


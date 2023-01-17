 /*
    
    Problem Statement
    -----------------
    Given an Array with n length,find the pair of element is equal to the target.If yes then result will be true otherwise false
    
    Time Complexity  : 
    Space Complexity :
    
    */

class TwoSum{

public static boolean twoSum(int []array,int target) {
		
		for(int i=0;i<array.length;i++) 
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==target)
					return true;				
			}		
		return false;
	}
}

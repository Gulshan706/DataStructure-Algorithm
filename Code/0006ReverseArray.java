 /*
    
    Problem Statement
    -----------------
    Given an Array with n length and start , end point. Reverse the array between start and end.
    
    Time Complexity  : 
    Space Complexity :
    
    */


class ReverseArray{

public static void reverseArrayBetweenStartAndEnd(int [] array,int start,int end) {
		
		int temp=0;
		for(int i=start;i<=(start+end)/2;i++) {
			temp=array[start+i];
			array[start+i]=array[end-i];
			array[end-i]=temp;
			
			
		}		
	}
}

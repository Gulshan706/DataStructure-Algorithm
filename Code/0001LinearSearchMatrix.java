  /*
    Problem Statement
    -----------------
    Given a square matrix and search the an element in that matrix present or not. If present then return indext of the matrix and return -1 element not present
    Time Complexity  : 
    Space Complexity :
 */

class LinearSearch{

public static int linearSearchMatrix(int [][] matrix, int target) {
	
		for(int i=0;i<matrix.length;i++) 
			for(int j=0;j<matrix.length;j++)
				if(matrix[i][j]==target) 
					return i;
			        		
		return -1;
	}
}

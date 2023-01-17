 /*
    
    Problem Statement
    -----------------
    Given matrix1 and matrix2 find the addintion of the matrix and return a matrix.
    
    Time Complexity  : 
    Space Complexity :
    
    */
    
 class OperationOnMatrix{
   
    public static int[][] sumOfMatrix(int[][] matrix1,int[][] matrix2) {
		int matrixSum[][]=new int[3][3];
		
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
			
		return matrixSum;
		
	}

 /*
    
    Problem Statement
    -----------------
    Given matrix1 and matrix2 find the subtraction of the  matrix and return a matrix.
    
    Time Complexity  : 
    Space Complexity :
    
    */

public static int[][] subOfMatrix(int[][] matrix1,int[][] matrix2) {
		int matrixSub[][]=new int[3][3];
		
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				matrixSub[i][j]=matrix1[i][j]-matrix2[i][j];
				
		
		return matrixSub;
		
	}

 /*
    
    Problem Statement
    -----------------
    Given matrix1 and matrix2 find the transpose of the  matrix.
    
    Time Complexity  : 
    Space Complexity :
    
    */

public static void transposeOfMatrix(int [][]matrix) {
		int temp=0;
		for(int i=0;i<matrix.length;i++) 
			for(int j=0;j<i;j++) {
				temp=matrix[i][j];
				matrix[i][j]= matrix[j][i];
				 matrix[j][i]=temp;
    }
  }
   
   
}















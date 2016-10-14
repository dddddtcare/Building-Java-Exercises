/*
 * Write a method called matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters,
 *  treats the arrays as two-dimensional matrixes, and returns their sum. 
 *  The sum of two matrixes A and B is a matrix C, where for every row i and column j, 
 *  Cij   Aij   Bij. You may assume that the arrays passed as parameters have the same dimensions.
 *  1,1,1,1
 *  1,1,1,1
 *  1,1,1,1
 */
public class Exercise19 {
//row length
	static void matrixAdd(int[][] array1,int[][] array2){
		int[][] result=new int[array1.length][array2[0].length];
		System.out.println(result[0].length);
		
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[1].length;j++){
		result[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		for(int i=0;i<result.length;i++){
			for(int j=0;j<result[0].length;j++){
		System.out.print(result[i][j]+" ");
		
			}
			System.out.println("");
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1={{1,1,1,1},{1,1,1,1},{1,1,1,1}};//3row 4 col
		int[][] array2={{1,1,1,1},{1,1,1,1},{1,1,1,1}};//3row 4 col
		
       matrixAdd(array1,array2);
	}

}

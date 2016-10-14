/**
. Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as
parameters and returns the count of how many elements from the array fall between the minimum and maximum
(inclusive). For example, in the array {14, 1, 22, 17, 36, 7, 43, 5}, for minimum value 4 and maximum value 17,
there are four elements whose values fall between 4 and 17.
*/
public class Exercise3{
	static int countInRange(int[] array,int min,int max){
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]<=max && array[i]>=min){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		int[] array={14, 1, 22, 17, 36, 7,-43, 5};
		System.out.println(countInRange(array,4,17));
	}
}
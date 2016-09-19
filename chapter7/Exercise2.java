 /*Write a method called range that returns the range of values in an array of integers. The range is defined as 1 more
than the difference between the maximum and minimum values in the array. For example, if an array called list
contains the values {36, 12, 25, 19, 46, 31, 22}, the call of range(list) should return 35 (46  12  1). You may
assume that the array has at least one element*/
public class Exercise2{
	public static int range(int[] array){
		int max=array[0];
		 
		int min=array[0];
	 
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
				maxIndex=i;
			}
		}
		for(int i=1;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
				minIndex=i;
			}
		}
		return max-min+1;
	}
	public static void main(String[] args){
      int[] array={36, 12, 25, 19, 46, 31, 22};
      System.out.println(range(array));
	}	
}
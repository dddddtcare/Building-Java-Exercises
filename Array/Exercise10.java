/**
 *  Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of
even numbers in the array as a real number. For example, if the array stores the elements {6, 2, 9, 11, 3}, then your
method should return 40.0. If the array contains no even elements or no elements at all, return 0.0.
 * @author rxu
 *
 */
public class Exercise10 {
    
	static float percentEven(int[] array){
		int count=0;
		float percent=0;
		int length=array.length;
		for(int i=0;i<length;i++){
			if(array[i]%2==0){
				count++;
			}
		}
		//System.out.println(count+" "+length);
		percent=(float)count/length;
		return percent*100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array={6, 2, 9, 11, 3};
      System.out.println(percentEven(array));
	}

}

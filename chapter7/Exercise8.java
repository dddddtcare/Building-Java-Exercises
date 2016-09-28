/**
 * Write a method called median that accepts an array of integers as its parameter
 *  and returns the median of the numbers in the array. The median is the number 
 *  that appears in the middle of the list if you arrange the elements in order.
Assume that the array is of odd size (so that one sole element constitutes the 
median) and that the numbers in the array are between 0 and 99 inclusive. For example, 
the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5 and the
median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25. 
(Hint: You may wish to look at the Tally program from earlier in this chapter for ideas.)
 * @author rxu
 *
 */
public class Exercise8 {
    static int median(int[] array){
    	int result;
    	int length=array.length;
    	bubbleSort(array);
    	return array[(length)/2];
    	
    }
	static void bubbleSort(int[] array){
		int length=array.length;
		while(length>0){
			for(int i=0;i<length-1;i++){
				if(array[i]>array[i+1]){
					swap(array,i,i+1);
				}
			}
			length--;
		}
	}
	static void swap(int[] array,int a, int b){
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] array= {1,2,3,6,9,2,3,4,5};
     // bubbleSort(array);
//      for(int item:array){
//    	  System.out.print(item+" ");
//      }
       System.out.println(median(array));
	}

}

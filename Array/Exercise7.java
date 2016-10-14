/**
 *  Write a method called stdev that returns the standard deviation of an array of integers. Standard deviation is computed by taking the square root of the sum of the squares of the differences between each element and the mean,
divided by one less than the number of elements. (It’s just that simple!) More concisely and mathematically, the
standard deviation of an array a is written as follows:
For example, if the array passed contains the values {1, –2, 4, 4, 9, 6, 16, 8, 25, 10}, your method should
return approximately 11.237.
 * @author rxu
 *
 */
public class Exercise7 {
    static int kthLargest(int[] array,int k){
    	int result=0;
    	
    	if(k==0){
    		return  getLargest(array);
    	}else{
    		
    	for(int i=1;i<k+1;i++){
    		removeLargest(array);
    	}
    	 
    	return getLargest(array);
    	}
    }
    static int getLargest(int[] array){
    	int largest=array[0];
    	for(int i=1;i<array.length;i++){
    		if(array[i]>largest){
    			largest=array[i];
    		}
    	}
    	return largest;
    }
    static void removeLargest(int[] array){
    	int largest=array[0];
    	int index=0;
    	for(int i=1;i<array.length;i++){
    		if(array[i]>largest){
    			largest=array[i];
    			index=i;
    		}
    	}
    	array[index]=0;
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] array ={2,6,3,6,8,9,2,33,1,66,79,32};
 System.out.println(kthLargest(array,3));
	}

}

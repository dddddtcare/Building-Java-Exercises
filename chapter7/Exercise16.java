/*
 * Write a method called append that accepts two integer arrays as parameters and returns a new array that 
 * contains the result of appending the second array’s values at the end of the first array. 
 * For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively, 
 * the call of append(list1, list2) should return a new array con- taining {2, 4, 6, 1, 2, 3, 4, 5}.
 *  If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.
 */
public class Exercise16 {
    static void append(int[]a,int[]b){
    	int[] result=new int[a.length+b.length];
    	int bIndex=0;
    	for(int i=0;i<a.length;i++){
    		result[i]=a[i];
    	}
    	for(int i=result.length-b.length;i<result.length;i++){
    		 
    		result[i]=b[bIndex++];
    	}
    	for(int item:result){
    		System.out.print(item+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] list1={2, 4, 6};
      int[] list2={1, 2, 3, 4, 5};
      append(list2,list1);
	}

}

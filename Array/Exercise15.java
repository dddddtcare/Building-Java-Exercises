/*
 * Write a method called collapse that accepts an array of integers as a parameter and returns a new array containing 
 * the result of replacing each pair of integers with the sum of that pair. For example, if an array called list stores 
 * the values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new array containing 
 * {9, 17, 17, 8, 19}. The first pair from the original list is collapsed into 9 (7   2), the second pair is collapsed 
 * into 17 (8   9), and so on. If the list stores an odd number of elements, the final element is not collapsed. 
 * For example, if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. 
 * Your method should not change the array that is passed as a parameter.
 */
public class Exercise15 {
    static void collapse(int[] array){
     
      int resultIndex=0;
     
      
      if(array.length%2==0){
    	  int[] result=new int[Math.round(array.length/2)];
      for(int i=0;i<array.length-1;i++){
    	   
    	  result[resultIndex++]=array[i]+array[i+1];
    	  i++;
    	  
      }
      for(int item:result){
    	  System.out.print(item+" ");
      }
      }else{
    	  int[] result=new int[Math.round(array.length/2)+1];
    	  for(int i=0;i<array.length-1;i++){
       	   
        	  result[resultIndex++]=array[i]+array[i+1];
        	  i++;
        	  
          }
    	  
    	  result[result.length-1]=array[array.length-1];
    	  for(int item:result){
        	  System.out.print(item+" ");
          }
    	  
      }
      
      
      
      
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array={1,2};
      collapse(array);
	}

}

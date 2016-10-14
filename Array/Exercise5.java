import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that
the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break
ties by choosing the lower value. For example, if the array passed contains the values {27, 15, 15, 11, 27}, your
method should return 15. (Hint: You may wish to look at the Tally program from this chapter to get an idea how to
solve this problem.) Can you write a version of this method that does not rely on the values being between 0 and 100?*/

public class Exercise5{
	static int mode(int[] array){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			if(map.containsKey(array[i])){
				map.put(array[i],map.get(array[i])+1);
			}else{
				map.put(array[i],1);
			}
		}

		 
		Map.Entry<Integer,Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		 
		int [] temp=new int[array.length];
		int temp1=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if(entry.getValue().equals(maxEntry.getValue())){
		    	temp[temp1++]=entry.getKey();
		    }
		}
		
//		for(Integer item :temp){
//			System.out.println(item);
//		}
		
	  int smallest=temp[0];
       for(int i=1;i<2;i++){
    	   if(temp[i]!=0&&temp[i]<smallest){
    		   smallest=temp[i];
    	   }
       }
       return smallest;
   
}
   
   

 
	public static void main(String[] args){
       int[] array={27, 15, 15, 11, 27,27};
       System.out.println(mode(array));
       
	}
}
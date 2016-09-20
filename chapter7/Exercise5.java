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

		Entry<Integer,Integer> maxEntry = null;

   for(Entry<Integer,Integer> entry : uniqueNames.entrySet()) {
    if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
        maxEntry = entry;
    }
}

	}
	public static void main(String[] args){

	}
}
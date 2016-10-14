import java.util.ArrayList;

/*
 * Write a method called minToFront that takes an ArrayList of integers as 
 * a parameter and moves the minimum value in the list to the front,
 *  otherwise preserving the order of the elements. For example, 
 *  if a variable called list stores (3, 8, 92, 4, 2, 17, 9), 
 *  the value 2 is the minimum, so your method should modify
 *   the list to store the values (2, 3, 8, 92, 4, 17, 9).
 */
public class Exercise6 {

	static void minToFront(ArrayList<Integer> arrayList){
		int targetIndex=0;
		int min=arrayList.get(0);
		
		for(int i=1;i<arrayList.size();i++){
			if(arrayList.get(i)<min){
				min=arrayList.get(i);
				targetIndex=i;
			}
         }
		
		printArrayList(arrayList);
		arrayList.remove(targetIndex);
		arrayList.add(0,min);
		System.out.println("");
		printArrayList(arrayList);
		
		
	}
	static void printArrayList(ArrayList arrayList){
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> arrayList=new ArrayList<Integer>();
      arrayList.add(3);
      arrayList.add(8);
      arrayList.add(92);
      arrayList.add(4);
      arrayList.add(2);
      arrayList.add(17);
      arrayList.add(9);
      
      
      minToFront(arrayList);
      
	}

}

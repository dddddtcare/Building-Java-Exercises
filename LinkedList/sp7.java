import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a method called wrapHalf that accepts a linked list of integers as a parameter and moves the first half of
 *  the list to the back of the list. If the list contains an odd number of elements,
 *   the smaller half is wrapped (in other words, for a list of size N, the middle element, N/2, 
 *   becomes the first element in all cases). For example, calling wrapHalf onthelist(1, 2, 3, 4, 5, 6),
 *   wouldchangethatlistinto(4, 5, 6, 1, 2, 3).Forthelist(5, 6, 7, 8, 9), the result would be (7, 8, 9, 5, 6).
 */
public class sp7 {

	static void wrapHalf(LinkedList<Integer> linkedList){
		 int halfLength=linkedList.size()/2;//last half part
		  int i=0;
		  while(i<halfLength){
			   linkedList.add(linkedList.remove(0));
			  
			  i++;
		  }
			  
		 
		 
	}
	static void printString(LinkedList<String> linkedList){
		Iterator<String> iterator=linkedList.iterator();
		 
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
		System.out.println("");
	}
	static void printInteger(LinkedList<Integer> linkedList){
		Iterator<Integer> iterator=linkedList.iterator();
		 
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		printInteger(linkedList);
		wrapHalf(linkedList);
		printInteger(linkedList);
		
	}

}

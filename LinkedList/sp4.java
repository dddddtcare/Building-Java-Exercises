import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a piece of code that counts the number of duplicate elements in a linked list,
 *  that is, the number of elements whose values are repeated at an earlier index in the list. 
 *  Assume that all duplicates in the list occur consecutively. For example,
 *  thelist(1, 1, 3, 5, 5, 5, 5, 7, 7, 11)containsfiveduplicates:oneduplicateofelementvalue1, 
 *  three duplicates of element value 5, and one duplicate of element value 7.
 */
public class sp4 {

	static int countDuplicate(LinkedList<Integer> linkedList){
		int result=0;
		Iterator<Integer> iterator=linkedList.iterator();
		int prev=iterator.next();
		while(iterator.hasNext()){
			int next=iterator.next();
			if(next==prev){
				result++;
			}
			prev=next;
		}
		return result;
	}
	static void print(LinkedList<Integer> linkedList){
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
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(7);
		linkedList.add(11);
		print(linkedList);
		System.out.println(countDuplicate(linkedList));
		
		
		

	}

}

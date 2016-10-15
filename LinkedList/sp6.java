import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a method called removeAll that accepts a linked list of integers as a parameter and removes all 
 * occurrences of a particular value. You must preserve the original relative order of the remaining 
 * elements of the list. For example, thecallremoveAll(list, 3) wouldchangethelist(3, 9, 4, 2, 3, 8, 17, 4, 3, 18, 2, 3)
 * to(9, 4, 2, 8, 17, 4, 18, 2).
 */
public class sp6 {

	static void removeAll(LinkedList<Integer> linkedList,int integer){
		Iterator<Integer> iterator=linkedList.iterator();
		while(iterator.hasNext()){
			if(iterator.next()==integer){
				iterator.remove();
			}
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
		linkedList.add(3);
		linkedList.add(9);
		linkedList.add(4);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(8);
		linkedList.add(17);
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(18);
		linkedList.add(2);
		linkedList.add(3);
		printInteger(linkedList);
		removeAll(linkedList,3);
		printInteger(linkedList);
		
	}

}

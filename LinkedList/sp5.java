import java.util.Iterator;
import java.util.LinkedList;
/*
 * 
5. Write a piece of code that inserts a String into an ordered linked list of Strings, maintaining sorted order.
For example, for the list ("Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"), inserting "Charlie" in order
 would produce the list ("Alpha", "Baker", "Charlie", "Foxtrot", "Tango", "Whiskey").
 */
public class sp5 {
	
	static void insert(LinkedList<String> linkedList,String string){
		Iterator<String> iterator=linkedList.iterator();
		 String s=iterator.next();
		 int index=1;
		while(iterator.hasNext()){
			 if(iterator.next().compareTo(string)<0){
				  s=iterator.next();
				  index++;
			 }else{
				 break;
			 }
			 
		}
		
		linkedList.add(index,string);
		 
		
		
	}
	static void print(LinkedList<String> linkedList){
		Iterator<String> iterator=linkedList.iterator();
		 
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Alpha");
		linkedList.add("Baker");
		linkedList.add("Foxtrot");
		linkedList.add("Tango");
		linkedList.add("Whiskey");
		print(linkedList);
		insert(linkedList,"Charlie");
		print(linkedList);
	}

}

import java.util.ArrayList;

/*
 * Write a method called removeDuplicates that takes as a parameter a sorted ArrayList
 *  of Strings and eliminates any duplicates from the list. For example, 
 *  if the list stores the values (“be”, “be”, “be”,“is”, “not”, “or”, “question”, “that”, “the”, “to”, “to”) 
 *  before the method is called, it should store the values
 *   (“be”, “is”, “not”, “or”, “question”, “that”, “the”, “to”) 
 *   after the method finishes executing. Because the values will be sorted, 
 *   all of the duplicates will be grouped together. 
 *   Assume that the ArrayList contains only String values, but keep in mind that it might be empty.
 */
public class Exercise7 {

	static void removeDuplicates(ArrayList<String> arrayList){
		 
		int i=0;
		while(i!=arrayList.size()-1){
			
			if(arrayList.get(i+1)==arrayList.get(i)){
				arrayList.remove(i+1);
			}else{
				i++;
			}
			 
			
		}
		 
	}
	
	static void printArrayList(ArrayList arrayList){
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("be");
		arrayList.add("be");
		arrayList.add("is");
		arrayList.add("not");
		arrayList.add("or");
		arrayList.add("question");
		arrayList.add("that");
		arrayList.add("the");
		arrayList.add("to");
		arrayList.add("to");
		arrayList.add("to");
		printArrayList(arrayList);
		removeDuplicates(arrayList);
		printArrayList(arrayList);
		
		
	}

}

import java.util.ArrayList;
import java.util.Collection;

/*
 * Write a method called removeInRange that accepts three parameters, 
 * an ArrayList of Strings, a beginning String, and an ending String, 
 * and removes from the list any Strings that fall alphabetically between 
 * the start and end Strings. For example, if the method is passed
 *  a list containing the elements
 *   (“to”, “be”, “or”, “not”, “to”, “be”, “that”, “is”, “the”, “question”),
 *    “free” as the start String, and “rich” as the end String, 
 *    the list’s elements should be changed to (“to”, “be”, “to”, “be”, “that”, “the”). 
 *    The “or”, “not”, “is”, and “question” should be removed 
 *    because they occur alphabetically between “free” and “rich”. 
 *    You may assume that the start String alphabetically precedes the ending String.
 */
public class Exercise10 {

	static void removeInRange(ArrayList arrayList,String a,String b){
		 
		int p=0;
		 
		while(p<arrayList.size()){
		if((((String) arrayList.get(p)).compareTo(a)>0 ) &&( ((String) arrayList.get(p)).compareTo(b)<0)){
			arrayList.remove(p);
		}else{
			p++;
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
    arrayList.add("to");
    arrayList.add("be");
    arrayList.add("or");
    arrayList.add("not");
    arrayList.add("to");
    arrayList.add("be");
    arrayList.add("that");
    arrayList.add("is");
    arrayList.add("the");
    arrayList.add("question");
    printArrayList(arrayList);
    removeInRange(arrayList,"free","rich");
    printArrayList(arrayList);
	}

}

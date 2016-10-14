import java.util.ArrayList;

/*
 * Write a method called doubleList that takes an ArrayList of Strings as a parameter and 
 * replaces every String with two of that same String. For example, 
 * if the list stores the values (“how”, “are”, “you?”) before the method is called, 
 * it should store the values (“how”, “how”, “are”, “are”, “you?”, “you?”) after the method finishes executing.
 */
public class Exercise4 {
    static void doubleList(ArrayList<String> arrayList){
    	for(int i=0;i<arrayList.size();i++){
    		arrayList.add(i+1, arrayList.get(i));
    		i++;
    		
    		 
    	}
    }
    //to be or not to be
    //0  1  2  3   4   5
    //to to be not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("to");
		arrayList.add("be");
		arrayList.add("or");
		arrayList.add("not");
		arrayList.add("to");
		arrayList.add("be");
		System.out.println(arrayList);
		doubleList(arrayList);
		System.out.println(arrayList);
		
	}

}

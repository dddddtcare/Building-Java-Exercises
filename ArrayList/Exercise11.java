import java.util.ArrayList;

/*
 * Write a method called stutter that accepts an ArrayList of strings as a parameter
 *  and that replaces every string with two of that string. 
 *  For example, if the list stores the values [“how”, “are”, “you?”], 
 *  after the call it should store [“how”, “how”, “are”, “are”, “you?”, “you?”].
 */
public class Exercise11 {

	static void stutter(ArrayList<String> arrayList){
		for(int i=0;i<arrayList.size();i++){
			arrayList.add(i+1,arrayList.get(i));
			i++;
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
		arrayList.add("how");
		arrayList.add("are");
		arrayList.add("you");
		
		printArrayList(arrayList);
		stutter(arrayList);
		printArrayList(arrayList);
		
		

	}

}

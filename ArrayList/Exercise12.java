import java.util.ArrayList;

/*
 * . Write a method called markLength4 that accepts an ArrayList of strings as a parameter 
 * and that places a string of four asterisks "****" in front of every string of length 4.
 *  For example, suppose that a variable called list contains the values 
 *  [“this”, “is”, “lots”, “of”, “fun”, “for”, “Java”, “coders”]. 
 *  The call of markLength4(list); should change the list to store the values 
 *  [“****”, “this”, “is”, “****”, “lots”, “of”, “fun”, “for”, “****”, “Java”, “coders”].
 */
public class Exercise12 {

	static void markLength4(ArrayList<String> arrayList){
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).length()==4){
				arrayList.add(i,"****");
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
		arrayList.add("this");
		arrayList.add("is");
		arrayList.add("lots");
		arrayList.add("of");
		arrayList.add("fun");
		arrayList.add("for");
		arrayList.add("java");
		arrayList.add("coders");
		printArrayList(arrayList);
		markLength4(arrayList);
		printArrayList(arrayList);

	}

}

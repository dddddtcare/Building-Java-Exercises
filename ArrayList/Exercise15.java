import java.util.ArrayList;

/*
 * Write a method called clump that accepts an ArrayList of strings as a parameter and 
 * replaces each pair of strings with a single string that consists of the two original 
 * strings in parentheses separated by a space. If the list is of odd length,
 *  the final element is unchanged. For example, suppose that a list contains 
 *  ["four", "score", "and", "seven", "years", "ago", "our"].
 *  Your method should change the list to store["(four score)", ("and seven"), ("years ago"), "our"].
 */
public class Exercise15 {
	static void clump(ArrayList<String> arrayList){
		int length=(arrayList.size()-arrayList.size()%2)/2;
		for(int i=0;i<length;i++){
			String temp;
			temp=arrayList.get(i)+arrayList.get(i+1);
			arrayList.remove(i);
			arrayList.remove(i);
			arrayList.add(i,"("+temp+")");
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
		arrayList.add("four");
		arrayList.add("score");
		arrayList.add("and");
		arrayList.add("seven");
		arrayList.add("years");
		arrayList.add("ago");
		arrayList.add("our");
		
		printArrayList(arrayList);
		clump(arrayList);
		printArrayList(arrayList);
	}

}

import java.util.ArrayList;

/*
 * Write a method called removeShorterStrings that accepts an ArrayList of strings as
 *  a parameter and removes from each pair of values the shorter string in the pair.
 *   If the list is of odd length, the final element is unchanged. 
 *   For example, suppose that a list contains ["four", "score", "and", ""seven", "years", "ago", "our"].
 *    In thefirstpair("four" and"score")theshorterstringis"four".
 *    Inthesecondpair("and"and"seven")the shorter string is "and". 
 *    In the third pair ("years" and "ago") the shorter string is "ago". 
 *    Your method should remove these shorter strings,
 *     changing the list to store ["score", "seven", "years", "our"]. 
 *     If both strings in a pair have the same length, remove the first string in the pair.
 */
public class Exercise14 {

	static void removeShorterStrings(ArrayList<String> arrayList){
		int length=(arrayList.size()-arrayList.size()%2)/2;
		
		for(int i=0;i<length;i++){
			if(arrayList.get(i).length()>arrayList.get(i+1).length()){
				arrayList.remove(i+1);
			}else{
				arrayList.remove(i);
			}
			//printArrayList(arrayList);
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
		removeShorterStrings(arrayList);
		printArrayList(arrayList);
	}

}

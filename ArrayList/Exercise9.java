import java.util.ArrayList;

/*
 * Write a method called rangeBetweenZeroes that takes as a parameter an ArrayList of 
 * integers and returns the number of indexes apart the two furthest occurrences of 
 * the number 0 are. For example, if the list stores the
values (7, 2, 0, 0, 4, 0, 9, 0, 6, 4, 8) when the method is called, it should return 6,
 because the occurrences of 0 that are furthest apart are at indexes 2 and 7, 
 and the range 2 through 7 has six elements. If only one 0 occurs in the list,
  your method should return 1. If no 0s occur, your method should return 0.
 */
public class Exercise9 {

	static int rangeBetweenZeroes(ArrayList<Integer> arrayList){
		 
		
		 while(arrayList.get(0)!=0){
			 arrayList.remove(0);
			 
		 }
	
		 int i=arrayList.size()-1;
		 while(arrayList.get(i)!=0){
			 arrayList.remove(i);
			 i--;
		 }
	 
			
		
		return arrayList.size()-1;
	 
	}
	static void printArrayList(ArrayList arrayList){
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args){
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(7);
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(0);
		arrayList.add(4);
		arrayList.add(0);
		arrayList.add(9);
		arrayList.add(0);
		arrayList.add(6);
		arrayList.add(4);
		arrayList.add(8);
		printArrayList(arrayList);
		System.out.println(rangeBetweenZeroes(arrayList));
		printArrayList(arrayList);
	}
}

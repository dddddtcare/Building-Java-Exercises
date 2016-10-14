import java.util.ArrayList;

/*
 * Write a method called removeZeroes that takes as a parameter an ArrayList of integers
 *  and eliminates any occurrences of the number 0 from the list. 
 *  For example, if the list stores the values (0, 7, 2, 0, 0, 4, 0) 
 *  before the method is called, it should store the values (7, 2, 4) 
 *  after the method finishes executing
 */
public class Exercise8 {

	static void removeZeroes(ArrayList<Integer> arrayList){
		int i=0;
		while(i!=arrayList.size()){
			if(arrayList.get(i)==0){
				arrayList.remove(i);
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
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(7);
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(0);
		arrayList.add(4);
		arrayList.add(0);
		printArrayList(arrayList);
		removeZeroes(arrayList);
		printArrayList(arrayList);
		
		
	}

}

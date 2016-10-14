import java.util.ArrayList;

/*
 *  Write a method called reverse3 that accepts an ArrayList of integer values as a parameter
 *   and reverses each suc- cessive sequence of three values in the list.
 *    If the list has extra values that are not part of a sequence of three, 
 *    those values are unchanged. For example, if a list stores values 
 *    [3, 8, 19, 42, 7, 26, 19, -8], after the call the list should store the values
 *     [19, 8, 3, 26, 7, 42, 19, -8]. The first sequence of three (3, 8, 19) 
 *     has been reversed to be (19, 8, 3). The second sequence (42, 7, 26)
 *      has been reversed to be (26, 7, 42), and so on. 
 *      Notice that 19 and –8 are unchanged because they were not part of a sequence of three values.
 */
public class Exercise13 {

	static void reverse3(ArrayList<Integer> arrayList){
		int length=arrayList.size()-arrayList.size()%3;
		
		for(int i=0;i<length;i++){
			int temp=arrayList.get(i);
			arrayList.remove(i);
			arrayList.add(i,arrayList.get(i+1));
			arrayList.remove(i+2);
			arrayList.add(i+2,temp);
			
			i=i+2;
			
			
			
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
		arrayList.add(3);//[3, 8, 19, 42, 7, 26, 19, -8]
		arrayList.add(8);
		arrayList.add(19);
		arrayList.add(42);
		arrayList.add(7);
		arrayList.add(26);
		arrayList.add(19);
		arrayList.add(-8);
		printArrayList(arrayList);
		reverse3(arrayList);
		printArrayList(arrayList);

	}

}

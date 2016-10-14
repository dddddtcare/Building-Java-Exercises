import java.util.ArrayList;

/*
 * Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as
 *  parameters and inserts the elements of a2 into a1 at alternating indexes. 
 *  If the lists are of unequal length, the remaining elements of the longer 
 *  list are left at the end of a1. For example, if a1 stores [10, 20, 30] 
 *  and a2 stores [4, 5, 6, 7, 8], the call of interleave(a1, a2);
 *   should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8]. If a1 had stored 
 *   [10, 20, 30, 40, 50] and a2 had stored [6, 7, 8],
 *    the call of interleave(a1, a2); would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].
 */
public class Exercise16 {

	static ArrayList<Integer> interleave(ArrayList<Integer> arrayList1,ArrayList<Integer> arrayList2){
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(arrayList1.size()>arrayList2.size()){
			int i=0;
			int j=0;
			while(i<arrayList2.size()*2){
				System.out.println(i);
				arrayList1.add(i,arrayList2.get(j));
				i=i+2;
				j++;
			}
			 result=arrayList1;
		}else{
			int i=0;
			int j=0;
			while(i<arrayList1.size()*2){
				System.out.println(i);
				arrayList2.add(i,arrayList1.get(j));
				i=i+2;
				j++;
			}
			result=arrayList2;
		}
		return result;
	}
	static void printArrayList(ArrayList arrayList){
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList1=new ArrayList<Integer>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		
		ArrayList<Integer> arrayList2=new ArrayList<Integer>();
		arrayList2.add(4);
		arrayList2.add(5);
		arrayList2.add(6);
		arrayList2.add(7);
		arrayList2.add(8);
		
		printArrayList(arrayList1);
		printArrayList(arrayList2);
		printArrayList(interleave(arrayList1,arrayList2));
		 
		
	}

}

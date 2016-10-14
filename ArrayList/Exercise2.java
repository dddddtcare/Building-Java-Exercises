import java.util.ArrayList;
/*
 * Write a method called swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. 
 * Your method should switch the order of the first two values, then switch the order of the next two, 
 * then the next two, and so on. If the number of values in the list is odd, 
 * the method should not move the final element. For example, if the list initially stores 
 * (“to”, “be”, “or”, “not”, “to”, “be”, “hamlet”), your method should change the list’s 
 * contents to (“be”, “to”, “not”, “or”, “be”, “to”, “hamlet
 */
public class Exercise2 {

	static ArrayList<String> swapPairs(ArrayList arrayList){
		// ArrayList<String> result=new ArrayList<String>();
		int length=arrayList.size();
		if(length%2==0){
			for(int i=0;i<arrayList.size();i++){
				swap(i,i+1,arrayList);
				i++;
			}
		}else{
			for(int i=0;i<arrayList.size()-1;i++){
				swap(i,i+1,arrayList);
				i++;
			}
			
		}
		
		return arrayList;
	}
	static void swap(int a,int b,ArrayList<String> arraylist){
		 
		 String string=arraylist.get(a);
		 arraylist.set(a, arraylist.get(b));
		 arraylist.set(b, string);
		
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
		//arrayList.add("hamlet");
		System.out.println(arrayList);
		swapPairs(arrayList);
System.out.println(arrayList);
	}

}

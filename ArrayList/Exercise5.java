import java.util.ArrayList;

import org.omg.CORBA.SystemException;

/*
 * Write a method called scaleByK that takes an ArrayList of integers as a parameter and 
 * replaces every integer of value K with K copies of itself. For example, 
 * if the list stores the values (4, 1, 2, 0, 3) before the method is called, 
 * it should store the values (4, 4, 4, 4, 1, 2, 2, 3, 3, 3) after the method
 *  finishes executing. Zeroes and negative numbers should be removed from the list by this method.
 */
public class Exercise5 {
	
	static void scaleByK(ArrayList<Integer> arrayList){
		
		 for(int i=0;i<arrayList.size();i++){
			 
			 int l=0;
			  
			 int length=arrayList.get(i);
			 for(int j=1;j<length;j++){
				 arrayList.add(i+j,arrayList.get(i));
				 l=i+j;
			 }
			 
			 if(l==arrayList.size()-1){
				 break;
			 }
			 
			 printArrayList(arrayList);
			 System.out.println("");
			 
			 if((arrayList.get(i+length)==0)&&(arrayList.get(i+length)<arrayList.size())){
				 arrayList.remove(i+length);
			 }
			 i=i+length-1;
			 
			 
			
			
			
		 }
		
		
	}
	
	static void printArrayList(ArrayList arrayList){
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(3);
		System.out.println(arrayList);
		scaleByK(arrayList);
		System.out.println(arrayList);

	}

}

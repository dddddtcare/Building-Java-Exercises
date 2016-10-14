import java.util.ArrayList;

/*
 * Write a method called removeEvenLength that takes an ArrayList of Strings as a parameter and removes all of
the Strings of even length from the list.
 */
public class Exercise3 {

	static void removeEvenLength(ArrayList<String> arrayList){
		    int length=arrayList.size()-1;
		    int i=0;
		    while(i!=length){
		       if(arrayList.get(i).length()%2==0){
				
				arrayList.remove(i);
             
			  }else{
            	 
            	 i++;
            	 
             }
		    
		    
			length=arrayList.size()-1;
		    
		    }
		    
		    
		    if(arrayList.get(arrayList.size()-1).length()%2==0){
		    	arrayList.remove(arrayList.get(arrayList.size()-1));
		    }else{
		    	
		    }
		    
		    
		    
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("to");
		arrayList.add("bef");
		arrayList.add("or");
		arrayList.add("not");
		arrayList.add("to");
		arrayList.add("be");
		System.out.println(arrayList);
		removeEvenLength(arrayList);
		System.out.println(arrayList);
		
		 
	}

}

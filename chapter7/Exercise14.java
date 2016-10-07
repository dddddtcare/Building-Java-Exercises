/*
 *  Write a method called contains that accepts two arrays of integers a1 and a2 as parameters and that returns a
boolean value indicating whether or not the sequence of elements in a2 appears in a1 (true for yes, false for no).
The sequence must appear consecutively and in the same order. For example, consider the following arrays:
int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};
The call of contains(list1, list2) should return true because the sequence of values in list2 {1, 2, 1} is contained
 in list1 starting at index 5. If list2 had stored the values {2, 1, 2}, the call of contains(list1, list2)
would return false. Any two lists with identical elements are considered to contain each other. Every array contains
the empty array, and the empty array does not contain any arrays other than the empty array itself.
 */
public class Exercise14 {
    static boolean contains(int[] a,int[] b){
    	boolean result=false;
    	boolean flag=true;
    	int bLength=b.length;
    	int [] tempArray=new int[bLength];
    	int start=0;
    	int end=b.length-1;
    	
    	for(int i=start;i<=end;i++){
    		tempArray[i]=a[i];
    	}
    	
    	for(int i=0;i<b.length;i++){
    		if(b[i]!=tempArray[i]){
    			flag=false;
    		}
    	}
    	if(flag==false){
    		flag=true;
    	}
    	
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
		int[] list2 = {1, 2, 1};
		
		System.out.println(contains(list1,list2));
	}

}

/*
 * Write a method called vowelCount that accepts a String as a parameter and 
 * produces and returns an array of integers representing the counts of
 *  each vowel in the string. The array returned by your method should hold 
 *  five ele- ments: the first is the count of As, the second is the count of Es, 
 *  the third Is, the fourth Os, and the fifth Us. Assume that the string contains 
 *  no uppercase letters. For example, the call vowelCount("i think, therefore i am") 
 *  should return the array {1, 3, 3, 1, 0}.
 */
public class Exercise17 {
    //a e i o u
	static void vowelCount(String s){
		int[] result=new int[5];
		char[] array=s.toCharArray();
		  
		 
		for(int i=0;i<array.length;i++){
			if(array[i]=='a'){
				result[0]++;
				}
			if(array[i]=='e'){
				result[1]++;
				}
			if(array[i]=='i'){
				result[2]++;
				}
			if(array[i]=='o'){
				result[3]++;
				}
			if(array[i]=='u'){
				result[4]++;
				}
		}
		
		for(int item: result){
			System.out.print(item+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i think, therefore i am";
		vowelCount(s);
		
	}

}

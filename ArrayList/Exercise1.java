import java.util.ArrayList; 
/* a method called averageVowels that takes an ArrayList of Strings as a parameter and returns the average
number of vowel characters (a, e, i, o, u) in all Strings in the list. If your method is passed an empty ArrayList, it
should return 0.0.
*/




 

 
public class Exercise1{

static ArrayList<Float> averageVowels(ArrayList<String> arrayList){
	ArrayList<Float> result=new ArrayList<Float>();
	int a=0,e=0,i=0,o=0,u=0;

	
	for(int p=0;p<arrayList.size();p++){
		String string=arrayList.get(p);
	for(int j=0;j<string.toCharArray().length;j++){
	 if(string.toCharArray()[j]=='a')
		 a++;
	 if(string.toCharArray()[j]=='e')
		 e++;
	 if(string.toCharArray()[j]=='i')
		 i++;
	 if(string.toCharArray()[j]=='o')
		 o++;
	 if(string.toCharArray()[j]=='u')
		 u++;
	}
	result.add((float)(a+e+i+o+u)/5);
	a=0;e=0;i=0;o=0;u=0;
	
	
	}
     
	return result;
	
}
public static void main(String[] args){
	 ArrayList<String> arrayList=new ArrayList<String>();
	 arrayList.add("aeiou");
	 arrayList.add("aaeeiioou");
	 arrayList.add("p");
	 System.out.println(averageVowels(arrayList));
	 
}
}
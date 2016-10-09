import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*
 * Write a method called wordLengths that accepts a Scanner for an input file as its parameter.
 *  Your method should open the given file, count the number of letters in each token in the file, 
 *  and output a result diagram of how many words contain each number of letters. For example, 
 *  consider a file containing the following text:
   Before sorting:
   13 23 480 –18 75
   hello how are you feeling today
   After sorting:
   –18 13 23 75 480
   are feeling hello how today you
Your method should produce the following output to the console. Use tabs so that the stars line up:
   1: 0
   2: 6 ******
   3: 10 **********
   4: 0
   5: 5 *****
   6: 1 *
   7: 2 **
   8: 2 **
Assume that no token in the file is more than 80 characters in length.
 */
public class Exercise18 {
    static void wordLengths(String s){
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String fileName="/Users/ruixu/Desktop/test.txt";
      String line=null;
      
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      
      try{
    	  FileReader fileReader=new FileReader(fileName);
    	  BufferedReader bufferedReader=new BufferedReader(fileReader);
    	 
    	  while((line=bufferedReader.readLine())!=null){
    		 // System.out.println(line);
    		  
    		  String regex = "-?[0-9]+";
    		  String data = null;
    		  String[] array=line.split(" |:");
//    		  
//    		  for(String item:array){
//    			  System.out.print(item+":");
//    		  }
//    		  System.out.println("");
    		  
    		   for(int i=0;i<array.length;i++){
    		   if(map.containsKey(array[i].length())){
    			   map.put(array[i].length(),map.get(array[i].length())+1);
    		   }else if(!map.containsKey(array[i].length())&&!array[i].matches(regex)){
    			   map.put(array[i].length(),1);
    		   }
    		   }
    		 
    		  
    	  }
    	  
    	  
    	  bufferedReader.close();
      }catch(FileNotFoundException ex){
    	  System.out.println(
                  "Unable to open file '" + 
                  fileName + "'"); 
      }catch(IOException ex){
    	  System.out.println(
                  "Error reading file '" 
                  + fileName + "'");
      }

      
      for (Integer key : map.keySet()) {
  	    System.out.println(key + " " + map.get(key));
  	}

  	 
      
	}
	
	

}

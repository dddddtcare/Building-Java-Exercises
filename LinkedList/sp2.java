/*
 * Would a LinkedList or an ArrayList perform better when run on the following code? Why?
   public static int min(List<Integer> list) {
       int min = list.get(0);
       for (int i = 1; i < list.size(); i++) {
           if (list.get(i) < min) {
               min = list.get(i);
} }
return min; }
 */
public class sp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("The code shown would perform better with an ArrayList, \n"
		+ "because it calls the get method many times using indexes \n"
		+ "in the middle of the list. This is a slow operation for a LinkedList.");
	}

}

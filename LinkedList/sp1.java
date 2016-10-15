import java.util.Scanner;

/*
 * 
 */
public class sp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("when should you use a LinkedList instead of an ArrayList?");
     Scanner console=new Scanner(System.in);
     System.out.println("see answer, enter 1");
     int answer=console.nextInt();
     
     if(answer==1){
    	 System.out.println("You should use a LinkedList when you plan\n to add or remove many values to or\n from the front or back of the list, or when you plan to make many filtering passes \nover the list during which you remove certain elements");
     }
     
	}

}

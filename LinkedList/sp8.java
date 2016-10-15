import java.util.Scanner;

public class sp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is an abstract data type (ADT)? What ADT does a linked list implement?");
		Scanner console=new Scanner(System.in);
		System.out.println("see answer enter 1");
		int answer=console.nextInt();
		if(answer==1){
			System.out.println("an abstract data type defines the type of data that a collection can hold and the operations that \n"
					+ "it can perform on that data.Linked lists implement the List abstract data type");
		}
		
	}

}

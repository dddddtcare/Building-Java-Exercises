import java.util.Scanner;

public class sp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("when should you use a TreeSet, and when should you use a HashSet?");
		Scanner console=new Scanner(System.in);
		System.out.println("answer is 1");
		if(console.nextInt()==1){
			System.out.println("You should use a TreeSet when you want\n"
					+ "to keep the data in sorted natural order\n"
					+ "you should use hashSets with nonComparable types or when order doesn’t mat- ter, to reduce the searching time to a minimum.");
		}
	}

}

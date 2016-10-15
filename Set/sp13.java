import java.util.HashSet;
import java.util.Set;

public class sp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set=new HashSet<Integer>();
		  set.add(74);
		   set.add(12);
		   set.add(182);
		   set.add(90);
		   set.add(43);
		   set.remove(74);
		   set.remove(999);
		   set.remove(43);
		   set.add(32);
		   set.add(182);
		   set.add(9);
		   set.add(29);
		   
		   System.out.println(set);
		
	}

}

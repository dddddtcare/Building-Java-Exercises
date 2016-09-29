/**
 * Write a method called minGap that accepts an integer array as a parameter and returns 
 * the minimum difference or gap between adjacent values in the array, where the gap is
 *  defined as the later value minus the earlier value. For example, in the array {1, 3, 6, 7, 12},
 *   the first gap is 2 (3 -1), the second gap is 3 (6 - 3), the third gap is 1 (7 - 6),
and the fourth gap is 5 (12 - 7). So your method should return 1 if passed this array. The minimum gap could be a
negative number if the list is not in sorted order. If you are passed an array with fewer than two elements, return 0.
 * @author rxu
 *
 */
public class Exercise9 {

	static int minGap(int[] array){
		int minGap=Integer.MAX_VALUE;
		int[] gap=new int[array.length-1];
		int index=0;
		for(int i=0;i<array.length-1;i++){
			gap[index++]=array[i+1]-array[i];
		}
//		for(int item:gap){
//			System.out.print(item+" ");
//		}
		minGap=getMin(gap);
		return minGap;
	}
	static int getMin(int [] array){
		int min=Integer.MAX_VALUE;
		for(int i=1;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array={1, 3, 6, 7, 12};
      System.out.println(minGap(array));
	}

}

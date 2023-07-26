import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a_array =  {8,3,2,6,1,9,4,5,7,0};
		
		for(int a :a_array) {
			System.out.print(a+" ");
		}
		System.out.println();
		Arrays.sort(a_array );
		int index=Arrays.binarySearch(a_array, 2);
		System.out.println(index);
		for(int a :a_array) {
			System.out.print(a+" ");
		}
		
	}

}


public class ArraysExample2 {

	public static void main(String[] args) {
		String string_array[] = new String[10];
		int[] a_array =new  int[10];
		String string_array2[] = {"abc","def",Integer.toString(1)};
		
		Employee employee[]= { new Employee(21,25588.02f,"sai"),
				new Employee(22,35588.02f,"sai"),new Employee(23,65588.02f,"sai")		
		};
		
		for(Employee emp:employee) {
			System.out.println(emp);
		}

	}

}

package ObjectCloning;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human sumit=new Human(21,"sumit dhanorkar");
		
		Human twin=(Human)sumit.clone();
		
		System.out.println(twin.age+" & "+twin.name);
		System.out.println(Arrays.toString(twin.arr));
		
		twin.arr[0]=100;
		
		
		System.out.println(Arrays.toString(sumit.arr));
		System.out.println(Arrays.toString(twin.arr));

		

		
	}
}

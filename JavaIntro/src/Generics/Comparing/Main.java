package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
   public static void main(String[] args) {
	   Student sumit=new Student(12,89.78f);
	   Student niraj=new Student(23, 99.78f);
	   Student arpit=new Student(5,99.78f);
	   Student rahul=new Student(2, 87.78f);
	   Student kunal=new Student(13,54.78f);
	   Student karan=new Student(9, 99.78f);
	   
	   Student[] list= {sumit,niraj, arpit,rahul ,kunal,karan};
	   System.out.println(Arrays.toString(list));
	   
	   Arrays.sort(list,(o1, o2) -> (int )(o1.marks-o2.marks));
	   
//	   Arrays.sort(list,new Comparator<Student>() {
//		   @Override
//		   public int compare(Student o1,Student o2) {
//			   return (int )(o1.marks-o2.marks);
//		   }
//	   });
	   
	   System.out.println(Arrays.toString(list));
	   
	  
	   
//	   if(sumit.compareTo(niraj)<0) {
//		   System.out.println("Niraj has more marks");
//	   }
	   
//	   System.out.println("dsafgasdf");
   }
}

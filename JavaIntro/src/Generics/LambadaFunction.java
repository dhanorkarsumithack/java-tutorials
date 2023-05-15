package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambadaFunction {
   public static void main(String[] args) {
	 ArrayList<Integer> list=new ArrayList<>();
	 
	 for(int i=0;i<5 ;i++) {
		 list.add(i+1);
	 }
	 
//	 list.forEach((item)->System.out.println(item*2));
	 Consumer<Integer> fun=(item)->System.out.print(" "+item*2);
	 list.forEach(fun);
	 
	 Operation sum =(a,b)->(a+b);
	 Operation prod =(a,b)->(a*b);
	 Operation sub =(a,b)->(a-b);
     
	 System.out.println();
	 LambadaFunction mycal=new LambadaFunction();
	 System.out.println( mycal.operate(4, 5,sum));
	 System.out.println( mycal.operate(4, 5,prod));
	 System.out.println( mycal.operate(4, 5,sub));
	 
   }
   
   private int operate(int a,int b,Operation op) {
	   return op.operation(a, b);
   }
}

interface Operation{
	int operation(int a, int b);
}

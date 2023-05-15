package AbstractDemo;

public abstract class Parent {
	
   public int age;
   public Parent(int age) {
	   this.age=age;
   }

  abstract void career();
   abstract void partner();
   
   static void hello() {
	   System.out.println("heloowsdff");
   }
   
   void normal() {
	   System.out.println("this is normal thing to us");
   }
   
 

}

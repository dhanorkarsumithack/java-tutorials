package AbstractDemo;

public class Main {
   public static void main(String[] args) {
	   Son son=new Son(12);
	   son.career();
	   
	   Daughter daughter=new Daughter(0);
	   daughter.career();
	   
	   Parent.hello();
//	   Parent mom=new Parent();
	   
	   son.normal();
	   
   }
}

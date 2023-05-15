package AbstractDemo;

public class Son extends Parent{
	
	public Son(int age) {
		super(age);
	}
	
	void normal() {
		super.normal();
	}
	
	@Override
	void career() {
		System.out.println("I am going to be Businessman");
	}
	
	@Override
	void partner() {
		System.out.println("I love India");
	}
	
	
	
	
}

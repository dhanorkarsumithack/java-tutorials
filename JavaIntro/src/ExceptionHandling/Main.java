package ExceptionHandling;

public class Main {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
//			divide(a,b);
		    String name="babu";
		    if(name.equals("babu")) {
		    	throw new MyException("name is babu");
		    }
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("normal exceptions");
		}finally {
			System.out.println("this will alway be excuted");
		}
	}
	
	static int divide(int a, int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("please do not divide by zero");
		}
		return a/b;
	}
}

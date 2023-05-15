
public class Main {
	
	Main(int a,int b){
		System.out.println("this is constructor");
	}
     
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello world");
        
        Main obj1=new Main(12,23);
        
        System.out.println(obj1.hashCode());
        
        System.out.println(obj1 instanceof Main);
        
        System.out.println(obj1.getClass().getName());
        
	}

}

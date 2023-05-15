package interfaces;

public class Main {
   public static void main(String[] args) {
//	Engine car=new Car();
	
	
//	System.out.println(car.a);
//	car.start();
//	car.acc();
//	car.stop();
//	
//	Media carMedia=new Car();
//	carMedia.stop();
	
	
	NiceCar car=new NiceCar();
	car.start();
	car.startMusic();
	
	car.upgradeEngine();
	car.start();
	
   }
}

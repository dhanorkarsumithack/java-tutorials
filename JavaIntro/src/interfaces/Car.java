package interfaces;

public class Car implements Engine,Brake,Media {
	int a=3;
	
	@Override
	public void brake() {
		System.out.println("I brake like normal class");
	}
	
	@Override
	public void start() {
		System.out.println("I start engine like normal class");
	}
	
	@Override
	public void stop() {
		System.out.println("I stop engine like normal class");
	}
	
	@Override
	public void acc() {
		System.out.println("I accelerate like normal class");
	}
	
   
}

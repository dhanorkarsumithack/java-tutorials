package com.sumit.FDP;


interface Icar{
	void start();
}

class SixSeater implements Icar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("this is sixSeater");

	}
	
}

class FourSeater implements Icar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("this is fourSeater");
	}
	
}




public class Car {

	public static void main(String[] args) {
		CarFactory carFactory=new CarFactory();

		Icar sixSeater=carFactory.GetCar("SixSeater");
		
		Icar fourSeater=carFactory.GetCar("FourSeater");
		sixSeater.start();
		fourSeater.start();
		
	}
}

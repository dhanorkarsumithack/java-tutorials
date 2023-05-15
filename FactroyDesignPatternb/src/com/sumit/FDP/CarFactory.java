package com.sumit.FDP;

public class CarFactory<T> {

	public Icar GetCar(String carType) {
		switch(carType) {
		case "SixSeater":
			return new SixSeater();
		case "FourSeater":
			return new FourSeater();
		}
		
		return null;
	}
}

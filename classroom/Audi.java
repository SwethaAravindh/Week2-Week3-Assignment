package week3.day1.classroom;

public class Audi extends Car {
	public void hybridFuel() {
		System.out.println("Fuel");
	}
	public void applyBrake() {
		System.out.println("ABSBrake");
		super.applyBrake();
	}

}

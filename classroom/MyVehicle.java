package week3.day1.classroom;

public class MyVehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.applyBrake();
		c.soundHorn();		
		BMW bmw = new BMW();
		bmw.applyBrake();
		bmw.autoPark();
		bmw.soundHorn();
		bmw.turnOnAC();
		bmw.openSunroof();
		Audi car= new Audi();
		car.applyBrake();
		car.soundHorn();
		car.openSunroof();
		car.hybridFuel();
		car.turnOnAC();
		Auto A = new Auto();
		A.applyBrake();
		A.soundHorn();
		A.handStarter();
		Bajaj B = new Bajaj();
		B.applyBrake();
		B.electronicMeter();
		B.soundHorn();
		B.handStarter();
		Vehicle V = new Vehicle();
		V.applyBrake();
		V.soundHorn();
		System.out.println("");
		car.applyBrake();
		
	}

}

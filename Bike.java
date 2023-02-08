package com.interface1.p1;

public class Bike implements Vehicle {
	public void condition() {
		System.out.println("Bike condition is good and can be used for transportation ");
		System.out.println("------------------------------------------------------------------------");
		
	}

	@Override
	public void start() {
		System.out.println("Bike is started by self start or push buttons");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void move() {
		System.out.println("Bike is moving by changing gears and acceleration");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopped, by applying brake and downshifting gears");
		
	}
}

package com.interface1.p1;

public class Car implements Vehicle{
	public void condition() {
		System.out.println("Car condition is good and can be used for transportation ");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void start() {
		System.out.println("Car is started by self start or push buttons");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void move() {
		System.out.println("Car is moving by changing gears and acceleration");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped, by applying brake and downshifting gears");
		
	}
}

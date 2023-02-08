package com.interface1.p1;

public class Cycle implements Vehicle {

	@Override
	public void condition() {
		System.out.println("Cycle condition is good and can be used for transportation ");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void start() {
		System.out.println("Cycle is started by peddling");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void move() {
		System.out.println("Cycle is moved by peddling");
		System.out.println("------------------------------------------------------------------------");
	}

	@Override
	public void stop() {
		System.out.println("Cycle is stopped by applying brake");
		
	}
    
}

package com.chan.home.study.abstract_test.Car;

public abstract class Study_Abstract_Car {

	public String color;
	public String tire;
	public int displacement;
	public String handle;

	public Study_Abstract_Car(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub

		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;

	}

	public abstract void getSpec();

}

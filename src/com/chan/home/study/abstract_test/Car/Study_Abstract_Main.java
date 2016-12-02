package com.chan.home.study.abstract_test.Car;

import com.chan.home.study.abstract_test.Car.Study_Abstract_Spec.Spec;

public class Study_Abstract_Main {

	public static void main(String[] args) {
		
		Study_Abstract_Car lowcar = new Study_Abstract_LowGrade(Spec.COLOR_RED,  Spec.TIRE_NORMAL, Spec.DISPALCEMENT_2000, Spec.HANDLE_NORMAL);
		Study_Abstract_Car highcar = new Study_Abstract_HighGrade(Spec.COLOR_BLUE,  Spec.TIRE_WILD, Spec.DISPALCEMENT_2200, Spec.HANDLE_POWER);
		
		lowcar.getSpec();
		highcar.getSpec();
		
	}
}

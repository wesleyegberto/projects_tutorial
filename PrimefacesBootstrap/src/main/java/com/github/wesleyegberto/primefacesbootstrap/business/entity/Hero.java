package com.github.wesleyegberto.primefacesbootstrap.business.entity;

public class Hero {
	public String name;
	public double power;

	public Hero(String name, double power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

}
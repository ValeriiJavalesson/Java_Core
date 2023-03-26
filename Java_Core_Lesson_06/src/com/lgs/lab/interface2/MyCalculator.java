package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	private double a;
	private double b;
	
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	MyCalculator(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double Plus() {
		
		return a+b;
	}

	@Override
	public double Minus() {
		
		return a-b;
	}

	@Override
	public double Multiply() {
		
		return a*b;
	}

	@Override
	public double Devide() {
		
		return a/b;
	}

}

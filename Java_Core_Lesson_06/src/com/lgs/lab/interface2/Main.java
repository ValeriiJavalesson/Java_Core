package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator(45, 5);

		System.out.println(calc.Plus());
		System.out.println(calc.Minus());
		System.out.println(calc.Multiply());
		System.out.println(calc.Devide());
		
		calc.setA(56.3);
		calc.setB(44.1);
		
		System.out.println(calc.Plus());
		System.out.println(calc.Minus());
		System.out.println(calc.Multiply());
		System.out.println(calc.Devide());
	}
	
}

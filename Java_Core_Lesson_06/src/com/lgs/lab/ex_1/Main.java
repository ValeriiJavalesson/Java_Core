package com.lgs.lab.ex_1;

public class Main {

	public static void main(String[] args) {
		HourWorker wh = new HourWorker("John", 8);
		MonthWorker wm = new MonthWorker("Vikram");
		
		wh.salary();
		wm.salary();

	}

}

package com.lgs.lab.ex_1;

public class MonthWorker extends Worker implements Salary{

	public MonthWorker(String workerName) {
		super(workerName);		
	}

	@Override
	public void salary() {
		System.out.println("Працівник "+ super.getWorkerName() + " отримує " + super.getFixedSalaryPerMounth() + " грн.");		
	}
	

}

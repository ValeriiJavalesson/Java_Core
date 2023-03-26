package com.lgs.lab.ex_1;

public class HourWorker extends Worker implements Salary{
	
	private int hoursOnJob;

	public HourWorker(String workerName, int hoursOnJob) {
		super(workerName);
		this.hoursOnJob = hoursOnJob;
	}

	@Override
	public void salary() {
		System.out.println("Працівник "+ super.getWorkerName() + " отримує " + hoursOnJob*22*super.getFixedSalaryPerHour() + " грн.");
		
	}

}

package com.lgs.lab.ex_1;

public class Worker {
	private int fixedSalaryPerHour = 70;
	private int fixedSalaryPerMounth = 12370;
	private String workerName;
	
	public void setFixedSalaryPerHour(int fixedSalaryPerHour) {
		this.fixedSalaryPerHour = fixedSalaryPerHour;
	}

	public void setFixedSalaryPerMounth(int fixedSalaryPerMounth) {
		this.fixedSalaryPerMounth = fixedSalaryPerMounth;
	}
	
	public int getFixedSalaryPerHour() {
		return fixedSalaryPerHour;
	}

	public int getFixedSalaryPerMounth() {
		return fixedSalaryPerMounth;
	}

	public Worker(String workerName) {
		this.workerName = workerName;
	}

	public String getWorkerName() {
		return workerName;
	}

}

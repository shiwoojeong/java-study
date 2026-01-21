package com.uty.exam04;

public class Robot {
	private String name;
	private String job;
	private static int population;
	
	public Robot(String name, String job) {
		this.name = name;
		this.job = job;
		population++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public static int getPopulation() {
		return population;
	}
	
}

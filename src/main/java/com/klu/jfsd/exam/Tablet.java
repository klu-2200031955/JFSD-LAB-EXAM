package com.klu.jfsd.exam;

public class Tablet extends Device{
	private double screenSize;
	private double batteryLife;
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public double getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}
}

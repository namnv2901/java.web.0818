package com.rikkeisoft.flashlamp;

public class FlashLamp {
	public boolean status;
	public Battery battery;

	public FlashLamp() {
		this.status = false;
	}

	public void setBattery(Battery b) {
		this.battery = b;
	}

	public int getBatteryInfo() {
		return battery.energy;
	}

	public void turnOn() {
		System.out.println("Turn on the lamp");
		if (battery.energy > 0) {
			status = true;
			System.out.println("Lamp status: " + status);
		} else {
			status = false;
			System.out.println("Lamp status: " + status);
			System.out.println("The FlashLamp is out of energy.");

		}

	}

	public void turnOff() {
		System.out.println("Turn off the lamp");
		status = false;
		battery.decreaseEnergy();
		System.out.println("Lamp status: " + status);
		if (battery.energy < 0) {
			battery.energy = 0;
		}
		System.out.println("Energy: " + battery.energy);

	}
}

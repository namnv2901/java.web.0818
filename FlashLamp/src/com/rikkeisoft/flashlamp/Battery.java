package com.rikkeisoft.flashlamp;

public class Battery {
	public int energy;

	public Battery() {
		this.energy = 10;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void decreaseEnergy() {
		energy -= 2;
	}
}

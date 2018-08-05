package com.rikkeisoft.flashlamp;

public class TestFlashLamp {

	public static void main(String[] args) {
		Battery battery = new Battery();
		FlashLamp flashLamp = new FlashLamp();
		flashLamp.setBattery(battery);
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + " Times");
			System.out.println("-----");
			flashLamp.turnOn();
			flashLamp.turnOff();
			System.out.println("====================");
		}
		System.out.println("Enery of the flash lamp is: " + flashLamp.getBatteryInfo());
	}
}

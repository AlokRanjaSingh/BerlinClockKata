package com.ubs.opsit.interviews;

public enum DigitalTimes {

	FIRSTDATE("00:00:00"), SECONDDATE("13:17:01"), THIRDDATE("23:59:59"), FOURTHDATE("24:00:00");

	private final String digitalTime;

	public String getDigitalTime() {
		return digitalTime;
	}

	private DigitalTimes(String time) {
		digitalTime = time;
	}

}

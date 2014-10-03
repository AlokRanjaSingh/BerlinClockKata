package com.ubs.opsit.interviews;

public class BerlinClock implements TimeConverter {

	@Override
	public String convertTime(String digitalTime) {
		String[] timeComponents = digitalTime.split(":");
		int hours = Integer.parseInt(timeComponents[0]);
		int minutes = Integer.parseInt(timeComponents[1]);
		int seconds = Integer.parseInt(timeComponents[2]);

		StringBuilder builder = new StringBuilder();

		builder.append(getValuesOfSecondsLamp(seconds) + "\n");
		builder.append(getValuesOfFiveHoursLamps(hours) + "\n");
		builder.append(getValuesOfOneHourLamps(hours) + "\n");
		builder.append(getValuesOfFiveMinutesLamps(minutes) + "\n");
		builder.append(getValuesOfOneMinuteLamps(minutes));

		return new String(builder);
	}

	private static String getValuesOfOneMinuteLamps(int minutes) {
		StringBuilder result = new StringBuilder("OOOO");

		for (int i = 0; i < (minutes % 5); i++) {
			result.replace(i, i + 1, "Y");
		}
		return result.toString();
	}

	private String getValuesOfFiveMinutesLamps(int minutes) {
		StringBuilder result = new StringBuilder("OOOOOOOOOOO");
		for (int i = 0; i < (minutes / 5); i++) {
			if ((i + 1) % 3 == 0)
				result.replace(i, i + 1, "R");
			else
				result.replace(i, i + 1, "Y");
		}
		return result.toString();
	}

	private static String getValuesOfOneHourLamps(int hours) {
		StringBuilder result = new StringBuilder("OOOO");
		for (int i = 0; i < (hours % 5); i++)
			result.replace(i, i + 1, "R");
		return result.toString();
	}

	private String getValuesOfFiveHoursLamps(int hours) {
		StringBuilder result = new StringBuilder("OOOO");
		for (int i = 0; i < (hours / 5); i++)
			result.replace(i, i + 1, "R");
		return result.toString();
	}

	private String getValuesOfSecondsLamp(int seconds) {
		if (seconds % 2 == 0)
			return "Y";
		return "O";
	}
}

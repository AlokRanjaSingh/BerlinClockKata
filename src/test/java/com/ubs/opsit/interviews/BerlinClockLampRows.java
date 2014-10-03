package com.ubs.opsit.interviews;

public enum BerlinClockLampRows {

	SECONDSROW(0), FIVEHOURSROW(1), ONEHOURROW(2), FIVEMINUTESROW(3), ONEMINUTEROW(4);

	private final Integer rowNumber;

	public Integer getRowCount() {
		return rowNumber;
	}

	private BerlinClockLampRows(int number) {
		rowNumber = number;
	}

}

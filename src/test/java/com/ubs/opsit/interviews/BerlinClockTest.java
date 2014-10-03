package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.BerlinClock;
import com.ubs.opsit.interviews.TimeConverter;

public class BerlinClockTest {

	TimeConverter berlinclock;

	@Before
	public void init() {
		berlinclock = new BerlinClock();
	}

	@Test
	public void isOneMinuteRowOfClockWorkingFine() {
		assertEquals(
				new String("OOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FIRSTDATE.getDigitalTime()),
						BerlinClockLampRows.ONEMINUTEROW));

		assertEquals(
				new String("YYOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.SECONDDATE.getDigitalTime()),
						BerlinClockLampRows.ONEMINUTEROW));

		assertEquals(
				new String("YYYY"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.THIRDDATE.getDigitalTime()),
						BerlinClockLampRows.ONEMINUTEROW));

		assertEquals(
				new String("OOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FOURTHDATE.getDigitalTime()),
						BerlinClockLampRows.ONEMINUTEROW));

	}

	@Test
	public void isFiveMinutesRowOfClockWorkingFine() {
		assertEquals(
				new String("OOOOOOOOOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FIRSTDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEMINUTESROW));

		assertEquals(
				new String("YYROOOOOOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.SECONDDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEMINUTESROW));

		assertEquals(
				new String("YYRYYRYYRYY"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.THIRDDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEMINUTESROW));

		assertEquals(
				new String("OOOOOOOOOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FOURTHDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEMINUTESROW));

	}

	@Test
	public void isOneHourRowOfClockWorkingFine() {
		assertEquals(
				new String("OOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FIRSTDATE.getDigitalTime()),
						BerlinClockLampRows.ONEHOURROW));

		assertEquals(
				new String("RRRO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.SECONDDATE.getDigitalTime()),
						BerlinClockLampRows.ONEHOURROW));

		assertEquals(
				new String("RRRO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.THIRDDATE.getDigitalTime()),
						BerlinClockLampRows.ONEHOURROW));

		assertEquals(
				new String("RRRR"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FOURTHDATE.getDigitalTime()),
						BerlinClockLampRows.ONEHOURROW));

	}

	@Test
	public void isFiveHourRowOfClockWorkingFine() {

		assertEquals(
				new String("OOOO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FIRSTDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEHOURSROW));

		assertEquals(
				new String("RROO"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.SECONDDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEHOURSROW));

		assertEquals(
				new String("RRRR"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.THIRDDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEHOURSROW));

		assertEquals(
				new String("RRRR"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FOURTHDATE.getDigitalTime()),
						BerlinClockLampRows.FIVEHOURSROW));

	}

	@Test
	public void isSecondsRowOfClockWorkingFine() {

		assertEquals(
				new String("Y"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FIRSTDATE.getDigitalTime()),
						BerlinClockLampRows.SECONDSROW));
		assertEquals(
				new String("O"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.SECONDDATE.getDigitalTime()),
						BerlinClockLampRows.SECONDSROW));
		assertEquals(
				new String("O"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.THIRDDATE.getDigitalTime()),
						BerlinClockLampRows.SECONDSROW));
		assertEquals(
				new String("Y"),
				getMyTimeComponentPart(berlinclock.convertTime(DigitalTimes.FOURTHDATE.getDigitalTime()),
						BerlinClockLampRows.SECONDSROW));
	}

	private String getMyTimeComponentPart(String berliTime, BerlinClockLampRows rowType) {
		String[] timeComponet = berliTime.split("\n");
		return timeComponet[rowType.getRowCount()];
	}
}

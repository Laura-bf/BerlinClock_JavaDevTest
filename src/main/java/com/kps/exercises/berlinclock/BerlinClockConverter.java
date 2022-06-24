package com.kps.exercises.berlinclock;

public class BerlinClockConverter {
	private static final char YELLOW_LIGTH = 'Y';
	private static final char RED_LIGTH = 'R';
	
	public String convert(final String timeString) {
		String[] timeUnits = timeString.split(":");
		int hours = Integer.valueOf(timeUnits[0]);
		int minutes = Integer.valueOf(timeUnits[1]);
		int seconds = Integer.valueOf(timeUnits[2]);
		
		StringBuilder secondsLine = getSecondsLine(seconds);
		StringBuilder hoursLines = getHoursLines(hours);
		StringBuilder minutesLines = getMinutesLines(minutes);
		
		return secondsLine.append(hoursLines).append(minutesLines).toString();
		
	}
	private StringBuilder getSecondsLine(int seconds) {
		StringBuilder result = new StringBuilder("O\n");
		if(seconds%2==0)
			result.replace(0, 1, Character.toString(YELLOW_LIGTH));
		return result;
	}
	
	private StringBuilder getHoursLines(int hours) {
		StringBuilder firstLine = new StringBuilder("OOOO\n");
		StringBuilder secondLine = new StringBuilder("OOOO\n");
		int lightsOnFirstLine = hours/5;
		int lightsOnSecondLine = hours%5;
		
		if(lightsOnFirstLine!=0) {
			for(int i=0; i<lightsOnFirstLine; i++)
				firstLine.setCharAt(i, RED_LIGTH);
		}
		if(lightsOnSecondLine!=0) {
			for(int i=0; i<lightsOnSecondLine; i++)
				secondLine.setCharAt(i, RED_LIGTH);
		}
		
		return firstLine.append(secondLine);
	}

	private StringBuilder getMinutesLines(int minutes) {
		StringBuilder firstLine = new StringBuilder("OOOOOOOOOOO\n");
		StringBuilder secondLine = new StringBuilder("OOOO\n");
		int lightsOnFirstLine = minutes/5;
		int lightsOnSecondLine = minutes%5;
	
		if(lightsOnFirstLine!=0) { 
			for(int i=0; i<lightsOnFirstLine; i++) {
				firstLine.setCharAt(i, YELLOW_LIGTH);
			}
			for(int j=2; j<lightsOnFirstLine; j+=3)
				firstLine.setCharAt(j, RED_LIGTH);
		}
		if(lightsOnSecondLine!=0)
			for(int i=0; i<lightsOnSecondLine; i++)
				secondLine.setCharAt(i, YELLOW_LIGTH);
		
		return firstLine.append(secondLine);
	}


}

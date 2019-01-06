package _02_ElementaryProgramming;

public class _09_ShowCurrentTIme {
	public static void main(String[] args) {
		long totalMiliseconds = System.currentTimeMillis();
		long totalSeconds = totalMiliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds  / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ": " + currentMinute +  ": " + currentSecond + " GMT");
	}
}

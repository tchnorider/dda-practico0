package utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeOperations {

	public static void difference(LocalDateTime since, LocalDateTime toDateTime) {
		try {
			LocalDateTime buildTime = LocalDateTime.from(since);

			long years = buildTime.until(toDateTime, ChronoUnit.YEARS);
			buildTime = buildTime.plusYears(years);

			long months = buildTime.until(toDateTime, ChronoUnit.MONTHS);
			buildTime = buildTime.plusMonths(months);

			long days = buildTime.until(toDateTime, ChronoUnit.DAYS);
			buildTime = buildTime.plusDays(days);

			long hours = buildTime.until(toDateTime, ChronoUnit.HOURS);
			buildTime = buildTime.plusHours(hours);

			long mins = buildTime.until(toDateTime, ChronoUnit.MINUTES);
			buildTime = buildTime.plusMinutes(mins);

			System.out.println(" Se trabajaron " + hours + " hora/s y " + mins
					+ " minutos.");

		} catch (Exception e) {
			System.out.println(" Error: " + e.toString());
		}
	}

	public LocalDateTime getLocalDateTime(String hora) {
		LocalDateTime fromDateTime = null;
		String timeInProgress = null;
		String horaEntrada = "";
		try {

			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(String.valueOf(LocalDateTime.now()));

			timeInProgress = String.valueOf(strBuilder);
			horaEntrada = timeInProgress.substring(0, 10) + " " + hora;

			System.out.println(" LocalDateTime Thn: " + horaEntrada);

			DateTimeFormatter formatter = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm");
			fromDateTime = LocalDateTime.parse(horaEntrada, formatter);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return fromDateTime;
	}
}

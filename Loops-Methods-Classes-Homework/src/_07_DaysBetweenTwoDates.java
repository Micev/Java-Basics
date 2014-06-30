import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		
		System.out.print("Insert first date : ");
		Scanner in = new Scanner(System.in);
		String firstdate = in.nextLine();
		System.out.print("Insert second date : ");
		String seconddate = in.nextLine();

		// Formatter
		DateTimeFormatter dateStringFormat = DateTimeFormat
				.forPattern("dd-MM-yyyy");
		DateTime firstTime = dateStringFormat.parseDateTime(firstdate);
		DateTime secondTime = dateStringFormat.parseDateTime(seconddate);
		int days = Days.daysBetween(new LocalDate(firstTime),
				new LocalDate(secondTime)).getDays();
		System.out.println("Days between the two dates " + days);
	}

}

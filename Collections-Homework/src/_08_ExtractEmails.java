import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String text = in.nextLine().toLowerCase();
		
		Pattern pattern = Pattern.compile("([\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7})");
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
		    System.out.println(matcher.group());
		}
	}

}

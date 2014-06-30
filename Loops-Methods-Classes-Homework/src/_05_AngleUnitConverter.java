import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		String measure = "";
		double number = 0;
		for (int i = 0; i < n; i++) {
			String input = in.nextLine();
			String[] param = input.split(" ");

			number = Double.parseDouble(param[0]);
			measure = param[1];

			if (measure.equals("deg")) {
				convertDegToRad(number, "rad");
			} else {
				convertRadToDeg(number, "deg");
			}

		}
	}

	private static void convertRadToDeg(double number, String string) {
		double result = number * (180 / Math.PI);
		System.out.printf("%.6f" + " " + string + "\n", result);

	}

	private static void convertDegToRad(double number, String string) {
		double result = number * (Math.PI / 180);
		System.out.printf("%.6f" + " " + string + "\n", result);

	}

}

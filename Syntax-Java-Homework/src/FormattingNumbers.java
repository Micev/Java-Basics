import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a (0<a<500) = ");
		int a = in.nextInt();
		System.out.print("Enter float b = ");
		float b = in.nextFloat();
		System.out.print("Enter float c = ");
		float c = in.nextFloat();

		String toHex = Integer.toHexString(a).toUpperCase();
		String toBin = String.format("%10s", Integer.toBinaryString(a))
				.replace(' ', '0');

		if (c % 1 == 0) 
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|", toHex, toBin, b, c);
		else 
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", toHex, toBin, b, c);
		

	}
}

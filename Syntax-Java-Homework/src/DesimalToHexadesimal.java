import java.util.Scanner;


public class DesimalToHexadesimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		String hexa = Integer.toHexString(a);
		System.out.println(hexa.toUpperCase());
	}

}

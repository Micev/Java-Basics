import java.util.Scanner;


public class _05_CountsAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] parse = input.split("\\W+");
		System.out.println(parse.length);
	}

}

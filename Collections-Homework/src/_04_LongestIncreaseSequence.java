import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreaseSequence {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] parse = input.split(" ");
		int[] numbers = new int[parse.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(parse[i]);
		}
		int counter = 1;
		int resetCounter = 1;
		int position = 0;
		System.out.print(numbers[0] + " ");
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				System.out.print(numbers[i] + " ");
				counter++;

			} else {
				System.out.print("\n" + numbers[i] + " ");
				counter = 1;
			}
			if (counter > resetCounter) {
				resetCounter = counter;
				position = i;
			}
		}
		System.out.print("\nLongest: ");
		int[] longest = new int[resetCounter];
		for (int i = 0; i < resetCounter; i++) {
			longest[i] = numbers[position];
			position--;
		}
		Arrays.sort(longest);
		for (int i : longest) {
			System.out.print(i + " ");
		}
	}

}

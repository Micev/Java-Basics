import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandOf5Card {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		

		String[] face = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };

		ArrayList list = new ArrayList<>();
		int count = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < count; j++) {
				Random rnd = new Random();
				String cardsRandom = (face[rnd.nextInt(face.length)]);
				char suitsRandom = (suits[rnd.nextInt(suits.length)]);

				String card = cardsRandom + suitsRandom;

				if (list.contains(card)) {
					count++;
				} else {
					list.add(card);
				}

			}
			count = 5;
			for (Object str : list) {
				System.out.printf("%s ", str);
			}
			list.clear();
			System.out.println();
		}
	}
}

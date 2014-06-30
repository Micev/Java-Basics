import java.util.Scanner;

class _07_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		
		int counter = 0;
		
		for (int i = 0; i <= input.length()-word.length(); i++) {
		if (input.substring(i,word.length()+i).equals(word)) {
			counter++;
		}
	}
		System.out.println(counter);
	}

}

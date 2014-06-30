import java.util.Scanner;


public class _06_CountSpecifietdWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		String[] parse = input.split("\\W+");
		int counter=0;
		//this is for ani substring like word
		/*for (int i = 0; i <= input.length()-word.length(); i++) {
			if (input.substring(i,word.length()+i).equals(word)) {
				counter++;
			}
		}*/
		for (int i = 0; i < parse.length; i++) {
			if (parse[i].equals(word)) {
				counter++;
			}
		}
		System.out.println(counter);
		

	}

}

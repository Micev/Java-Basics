import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] str = input.split(" ");
		int counter=1;
		int resetCounter = 1;
		int position = 0;
		
		for (int i = 0; i < str.length-1; i++) {
			if (str[i].equals(str[i+1])) {
				counter++;
			}else {
				counter = 1;
			}
			if (counter>resetCounter) {
				position=i;
				resetCounter = counter;
			}
		}
		for (int i = 0; i < resetCounter; i++) {
			System.out.print(str[position]+" ");
		}
	}

}

import java.util.Scanner;


public class _02_GenerateLetterWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char [] arr = in.next().toCharArray();
		
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				for (int c = 0; c < arr.length; c++) {
					System.out.printf("%s%s%s ",arr[a],arr[b],arr[c]);
				}
			}
		}
	}

}


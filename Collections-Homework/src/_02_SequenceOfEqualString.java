import java.util.Scanner;


public class _02_SequenceOfEqualString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		String [] str = input.split(" ");
		System.out.print(str[0]);
		for (int i = 1; i < str.length; i++) {
			if (str[i].equals(str[i-1])) {
				System.out.print(" "+str[i]);
			}else {
				System.out.print("\n"+str[i]);
			}
		}
		
		

	}

}

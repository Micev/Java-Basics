import java.util.Scanner;


public class _01_SymmetricNumberInRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int start = in.nextInt();
		int end = in.nextInt();
		
		for (int i = start; i <=end; i++) {
			if (Integer.toString(i).equals(new StringBuffer(Integer.toString(i)).reverse().toString())) {
				System.out.print(i+" ");
			}
		}

	}

}

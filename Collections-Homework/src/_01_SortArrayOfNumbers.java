import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] number = new int[n];
		for (int i = 0; i < number.length; i++) {
			number[i]=in.nextInt();
		}
		Arrays.sort(number);
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfString {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int n = in.nextInt();
		String [] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i]=in.next();
		}	
		Arrays.sort(str);
		for (String string : str) {
			System.out.println(string);
		}
		in.close();
	}

}

import java.util.Scanner;
public class TheSmallestOf3Numbers {
	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
 		
        double first = Double.parseDouble(in.next());
        double second = Double.parseDouble(in.next());
        double third = Double.parseDouble(in.next());
        
        double smallest = Math.min(first, Math.min(second, third));
        System.out.println(smallest);
	}
}
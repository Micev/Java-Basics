import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine().toLowerCase();
		
		String[] parse = input.split("\\W+");
		
		Set<String> set = new TreeSet<String>();
		for (String string : parse) {
			set.add(string);
		}
		set.stream().forEach(x->System.out.print(x+" "));
		//System.out.println(set);
	}

}

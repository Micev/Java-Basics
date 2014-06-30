import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("aX = ");
		int ax = in.nextInt();
		System.out.print("aY = ");
		int ay = in.nextInt();
		
		System.out.print("bX = ");
		int bx = in.nextInt();
		System.out.print("bY = ");
		int by = in.nextInt();
		
		System.out.print("cX = ");
		int cx = in.nextInt();
		System.out.print("cY = ");
		int cy = in.nextInt();
		
		int area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;
		
		if (area >= 0)
			System.out.println(area);
		else
			System.out.println(area * -1);

	}

}

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int low = 0;
		int high = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * (high - low)) + low;
		int b = (int)(Math.random() * (high - low)) + low;
		int c = (int)(Math.random() * (high - low)) + low;
		System.out.println(a + " " + b + " " + c);
		int first, second, third;
		first = Math.min(a, Math.min(b, c));
		third = Math.max(a, Math.max(b, c));
		second = a + b + c -first - third;
		System.out.println(first + " " + second + " " + third);

	}
}

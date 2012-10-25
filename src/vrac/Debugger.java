package vrac;

public class Debugger {

	public static void main(String[] args) {
		int a = 3;
		int b = 8;

		System.out.println("a=" + a + " - b=" + b);

		a += b;
		b = a-b;
		a -= b;

		System.out.println("a=" + a + " - b=" + b);
	}
}
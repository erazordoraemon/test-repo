package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		try {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(a + "/" + b + " = " + (a/b));
		} catch (InputMismatchException ime) {
			System.out.println("Valeurs non entières");
		} catch (ArithmeticException ae) {
			System.out.println("Impossible de diviser par zéro"); 
		}
	}
}
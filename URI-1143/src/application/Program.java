package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int one = i;
			int two = i * i;
			int three = i * i * i;
			System.out.printf("%d %d %d%n", one, two, three);

		}

		sc.close();

	}

}

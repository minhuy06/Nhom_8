package baitap2;

import java.util.Scanner;

public class Bài6 {
	static int a, b, tg, UCLN, BCNN;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen thu nhat: ");
		a = scanner.nextInt();
		System.out.print("Nhap so nguyen thu hai:  ");
		b = scanner.nextInt();
		int x = a, y = b;
		while (b != 0) {
			tg = b;
			b = a % b;
			a = tg;
		}
		UCLN = a;
		BCNN = (x * y) / UCLN;
		System.out.println("UCLN = " + UCLN);
		System.out.println("BCNN = " + BCNN);
		scanner.close();
	}
}

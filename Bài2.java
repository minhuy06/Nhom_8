package baitap2;

import java.util.Scanner;

public class Bài2 {
	static int a, b, c, min;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so a: ");
		a = scanner.nextInt();
		System.out.print("Nhap so b: ");
		b = scanner.nextInt();
		System.out.print("Nhap so c: ");
		c = scanner.nextInt();
		min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("So nho nhat la: " + min);
		scanner.close();
	}
}

package hh;

import java.util.Scanner;

public class bai_3 {
	public static void main(String[] args) {
		char PhepToan;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		int a = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		int b = sc.nextInt();
		System.out.println("Nhap phep toan: ");
		PhepToan = sc.next().charAt(0);
		switch (PhepToan) {
		case '+':
			System.out.println("Tong 2 so la: "+ (a+b));
			break;
		case '-':
			System.out.println("Hieu 2 so la: "+ (a-b));
			break;
		case '*':
			System.out.println("Tich 2 so la: "+ (a*b));
			break;
		case '/':
			System.out.println("Thuong 2 so la: "+ (a/b));
		case '.':
			break;
		}
	}
}
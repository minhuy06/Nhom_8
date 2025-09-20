package baitap2;

import java.util.Scanner;

public class Bài7 {
	static Scanner scanner;
	static int[] M;
	static int N, x, i, Sum;

	static void Nhap() {
		System.out.print("Nhập số phần tử: ");
		N = scanner.nextInt();
		M = new int[N];
		for (i = 0; i < N; i++) {
			System.out.print("M[" + i + "]=");
			M[i] = scanner.nextInt();
		}
	}

	static void Xuat() {
		for (i = 0; i < N; i++)
			System.out.print(M[i] + ",");
	}

	static int Sum() {
		Sum = 0;
		for (i = 0; i < N; i++)
			Sum = Sum + M[i];
		return Sum;
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Nhap();
		System.out.println("--------------------------------------------");
		System.out.print("Mảng là: ");
		Xuat();
		System.out.println("\nTổng các phần tử trong mảng là: " + Sum());
		scanner.close();
	}
}

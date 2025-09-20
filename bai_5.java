package hh;

import java.util.Scanner;

public class bai_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int so;
		int kt = 1;
		do {
			System.out.println("Nhap so nguyen: ");
			so = sc.nextInt();
		}while(so < 3);
		for(int i=2;i<=so/2;i++) {
			if(so%i==0) {
				kt = 0;
				break;
			}
		}
		if(kt == 0)
			System.out.println("Khong phai so nguyen to");
		else
			System.out.println("La so nguyen to");
	}
}

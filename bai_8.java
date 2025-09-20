package hh;

import java.util.Scanner;

public class bai_8 {
	public static void main(String[] args) {
		int max=0;
		int vt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap SPT mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		for(int x=0;x<n-1;x++){
			int dem=1;
			for(int y=x+1;y<n;y++) {
				if(a[y]==a[x])
					dem++;
			}
			if(dem>max) {
				max = dem;
				vt = x;
			}
		}
		if(max<=1)
			System.out.println("Khong co so xuat hien nhieu nhat");
		else
			System.out.println("So xuat hien nhieu nhat la: "+a[vt]+"");
	}
}
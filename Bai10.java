import java.util.Scanner;
import java.util.Arraylist;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập danh sách ban đầu
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < list.size(); i++) {
            list.add(sc.nextInt());
        }

        // Thêm phần tử
        System.out.print("Nhap vi tri can them: ");
        int posAdd = sc.nextInt();
        System.out.print("Nhap gia tri can them: ");
        int value = sc.nextInt();
        if (posAdd >= 0 && posAdd <= list.size()) {
            list.add(posAdd, value);
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        // Xoá phần tử
        System.out.print("Nhap vi tri can xoa: ");
        int posDel = sc.nextInt();
        if (posDel >= 0 && posDel < list.size()) {
            list.remove(posDel);
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        // In kết quả
        System.out.println("Danh sach cuoi cung: " + list);
        sc.close();
    }
}


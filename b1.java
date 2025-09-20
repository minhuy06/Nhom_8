import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số cần kiểm tra:");
        int so = sc.nextInt();

        if (so > 0) {
            System.out.println("là số dương");
        } else if (so < 0) {
            System.out.println("là số âm");
        } else {
            System.out.println("là số 0");
        }
    }
}

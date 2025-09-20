import java.util.Scanner;
public class b4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,S=0;
        System.out.println("Nhap n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            S+=i;
        }
        System.out.println("Tổng là "+S);
    }
}

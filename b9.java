import java.util.Scanner;
import java.util.ArrayList;
public class b9 {
    public static void main(String[] args) {
        ArrayList<Integer> day= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int v,chon;
        do{
            System.out.print("Thêm số: ");
            v=sc.nextInt();
            day.add(v);
            System.out.println("chọn số bất kì để tiếp tục 0 để dừng");
            chon=sc.nextInt();
        }while(chon!=0);
        for(int pt:day){
            System.out.print(pt+" ");
        }
    }
}

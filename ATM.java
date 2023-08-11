import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền muốn rút (bội số của 50.000 đồng): ");
        int soTien = scanner.nextInt();

        int dem500 = soTien / 500000;

        int conLai = soTien % 500000;

        int dem200 = conLai / 200000;

        conLai = conLai % 200000;

        int dem100 = conLai / 100000;

        conLai = conLai % 100000;

        int dem50 = conLai / 50000;

        System.out.println("Số tờ tiền 500.000 đồng là: " + dem500);
        System.out.println("Số tờ tiền 200.000 đồng là: " + dem200);
        System.out.println("Số tờ tiền 100.000 đồng là: " + dem100);
        System.out.println("Số tờ tiền 50.000 đồng là: " + dem50);
        System.out.println("tổng số lượng các tờ tiền là: " + (dem50 + dem100 + dem200 +dem500));

    }
}
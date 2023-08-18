import java.util.Scanner;

public class chuoiDaoNghich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoiNhap = sc.nextLine();
        sc.close();

        int kiemtra = 1;
        int doDai = chuoiNhap.length();

        for (int i = 0; i < doDai / 2; i++) {
            if (chuoiNhap.charAt(i) != chuoiNhap.charAt(doDai - i - 1)) {
                kiemtra = 0;
                break;
            }
        }

        if (kiemtra == 1) {
            System.out.println("Chuỗi là chuỗi palindrome.");
        } else {
            System.out.println("Chuỗi không là chuỗi palindrome.");
        }
    }
}
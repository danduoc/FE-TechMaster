import java.util.Scanner;
import java.lang.Math;

public class soLonNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("N=");
			n = sc.nextInt();
			
		} while (n <= 0);
        int max = 0;
        int phanDu = n;
        
        while (phanDu > 0) {
            if (phanDu > max) {
				max = phanDu;
			}
        }

        System.out.println("Chữ số lớn nhất là " + max);
	}
}

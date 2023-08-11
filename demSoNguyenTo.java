import java.util.Scanner;
import java.lang.Math;

public class demSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("N=");
		n = sc.nextInt();
		
		int demSNT = 0;
		for (int k = 1; k <= n; k++) {
			System.out.print("nhập số thứ "+k+ ":");
			int a = sc.nextInt();
			int dem = 0;
			for (int i = 1; i <= a; i++) {
				if (a%i == 0) {
					dem++;
				}
			}
			if (dem == 2) {
				demSNT++;
			}
		}
		System.out.println("có " +demSNT+ " số nguyên tố");
	}
}

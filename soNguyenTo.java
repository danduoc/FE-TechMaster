import java.util.Scanner;
import java.lang.Math;

public class soNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("N=");
		n = sc.nextInt();
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i ==0) {
				dem++;
			}
		}
		if (dem == 2) {
			System.out.println(n+" là số nguyên tố");
		} else {
			System.out.println(n+" không phải là số nguyên tố");
		}
	}
}

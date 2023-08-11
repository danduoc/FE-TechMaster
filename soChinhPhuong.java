import java.util.Scanner;
import java.lang.Math;

public class soChinhPhuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
//		if (Math.sqrt(n) == (int)Math.sqrt(n)) {
//			System.out.println(n+" là số chính phương");
//		} else {
//			System.out.println(n+" là số chính phương");
//		}
		boolean check = false;
		for (int i = 1; i*i <= n; i++) {
			if (n%i == 0 && i*i == n) {
				check = true;
				break;
			}
		}
		if (check == true) {
		System.out.println(n+" là số chính phương");
		} else {
		System.out.println(n+" là số chính phương");
		}
	}
}

import java.util.Scanner;
import java.lang.Math;

public class demUoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int dem = 0;
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i ==0) {
				dem ++;
				tong += i;
			}
		}
		
			System.out.println("Số ước của " +n+ " là: " +dem);
			System.out.println("Tổng các ước của " +n+ " là: " +tong);
		
	}
}

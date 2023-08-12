import java.util.Scanner;
import java.lang.Math;

public class htSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("N=");
		n = sc.nextInt();
		System.out.print("Các số nguyên tố từ 1 đến " +n+ " là: ");
		for (int j = 1; j <= n; j++) {
			int dem = 0;
			for (int i = 1; i <= j; i++) {
				if (j%i == 0) {
					dem++;
				}
			}
			if (dem == 2) {
				System.out.print(j+ ", ");
			}
		}
	}
}
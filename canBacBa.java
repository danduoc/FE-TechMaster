import java.util.Scanner;
import java.lang.Math;

public class canBacBa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.println("Nhập N:");
			double n = sc.nextDouble();
			double kq = 0;
			
			if (n == 0) {
				System.out.println("Căn bậc 3 của " +n+ " = 0");
			} else {
				if (n > 0) {
					kq = Math.pow(Math.abs(n), 1.0/3);
				} else {
					kq = - Math.pow(Math.abs(n), 1.0/3);
				}
				System.out.println("Căn bậc 3 của " +n+ " = " + kq);
			}

	}
}

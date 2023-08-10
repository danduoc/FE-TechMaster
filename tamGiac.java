import java.util.Scanner;
import java.lang.Math;

public class tamGiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.println("Nhập chiều dài cạnh a");
			double a = sc.nextDouble();

			System.out.println("Nhập chiều dài cạnh b");
			double b = sc.nextDouble();
			
			System.out.println("Nhập chiều dài cạnh c");
			double c = sc.nextDouble();
			
			if (a + b > c && a + c > b && c + b > a) {
				if (a == b & a == c) {
					System.out.println("tam giác đều");
				} else {
						if (a == b || b == c || a == c) {
							if (a * a + b * b == c * c||c * c + b * b == a * a || a * a + c * c == b * b) {
								System.out.println("tam giác vuông cân");
							} else {
								System.out.println("tam giác cân");
							}
							
						} else {
							if (a * a + b * b == c * c||c * c + b * b == a * a || a * a + c * c == b * b) {
								System.out.println("tam giác vuông");
							}else {
									System.out.println("tam giác thường");
							}
						}
					}
		
			} else {
				System.out.println("không phải là tam giác");
			}
	}
}

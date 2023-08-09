import java.util.Scanner;
import java.lang.Math;

public class xepHangHocLuc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập điểm bài kiểm tra");
		double kt = sc.nextDouble();

		System.out.println("Nhập điểm bài thi giữa kỳ");
		double gk = sc.nextDouble();
		
		System.out.println("Nhập điểm bài thi cuối kỳ");
		double kk = sc.nextDouble();
		
		double tb = (kt + gk + kk)/3;
		
		if (tb >= 9.0) {
			System.out.println("hạng A");
		} else {
			if (tb >= 7) {
				System.out.println("hạng B");
			} else {
				if (tb >= 5) {
					System.out.println("hạng C");
				} else {
					System.out.println("hạng F");
				}
			}
		}
	}
}

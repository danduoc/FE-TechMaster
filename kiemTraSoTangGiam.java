import java.util.Scanner;
import java.lang.Math;

public class kiemTraSoTangGiam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("N=");
		n = sc.nextInt();
		if (n < 10) {
			System.out.println("Số đã nhập không hợp lệ");
		} else {
			int snt1 = n%10;
			n = n/10;
			int snt2 = n%10;
			int check = 1;
			if (snt1 > snt2) {
				check = 0;
			}	
			while (n != 0) {
				if (snt1 > snt2) {
					check = 0;
					break;
				}
				n = n/10;
				snt1 = snt2;
				snt2 = n%10;
			}
			if (check ==1) {
				System.out.println("Số " +n+ " hợp lệ");
			} else {
				System.out.println("Số " +n+ " không hợp lệ");
			}
			
		}
	}
     
}

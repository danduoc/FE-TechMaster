import java.util.Scanner;

public class TimSoLonHon {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
	double a,b;
    System.out.println("nhập a:");
    a = scanner.nextDouble();
    
    System.out.println("nhập b:");
    b = scanner.nextDouble();

    if (a>b) {System.out.println("số "+a);
	} else {
		System.out.println("số "+b);
	}
}
}

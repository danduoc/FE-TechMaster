import java.util.Scanner;

public class timMax {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
	double a,b,c;
    System.out.println("nhập a:");
    a = scanner.nextDouble();
    
    System.out.println("nhập b:");
    b = scanner.nextDouble();

    System.out.println("nhập c:");
    c = scanner.nextDouble();
    
    double max=a;
    if (b>max) {
		max=b;
	}
    if (c>max) {
		max=c;
	}
		System.out.println("số lớn nhất là: "+max);

}
}
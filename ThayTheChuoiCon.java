import java.util.Scanner;

public class ThayTheChuoiCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi 1: ");
		String str1 = sc.nextLine();
		System.out.print("Nhập chuỗi 2: ");
		String str2 = sc.nextLine();
		System.out.print("Nhập chuỗi 3: ");
		String str3 = sc.nextLine();

		String replacedStr = str1.replace(str2, str3);

		System.out.print("Chuỗi mới là: " + replacedStr);
	}
}

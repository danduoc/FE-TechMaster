import java.util.Scanner;

public class DemChuoiCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi 1: ");
		String str1 = sc.nextLine();
		System.out.print("Nhập chuỗi 2: ");
		String str2 = sc.nextLine();
		int k = 0;
		for (int i = 0; i < str1.length()-str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				if (str1.substring(i, i + str2.length()).equals(str2)) {
					k++;
				}
			}

		}
		System.out.print("Chuỗi " + str2 + " xuất hiện " + k + " lần trong chuỗi " + str1);
	}
}

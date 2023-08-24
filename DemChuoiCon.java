import java.util.Scanner;

public class DemChuoiCon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi 1: ");
		String str1 = sc.nextLine();
		System.out.print("Nhập chuỗi 2: ");
		String str2 = sc.nextLine();
		int dem = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				if (str1.substring(i, i + str2.length()).equals(str2)) {
					dem++;
				}
			}

		}
		System.out.print("Chuỗi " + str2 + " xuất hiện " + dem + " lần trong chuỗi " + str1);
	}
}

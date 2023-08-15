import java.util.Scanner;

public class chuanHoaTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String ten = sc.nextLine();
		String[] words = ten.trim().split("\\s+");
		String tenChuan = " ";
		 for (String word : words) {
	            if (!word.isEmpty()) {
	                char firstChar = Character.toUpperCase(word.charAt(0));
	                String restOfWord = word.substring(1).toLowerCase();
	                tenChuan += firstChar + restOfWord + " ";
	            }
	        }
		 System.out.println("Họ và tên chuẩn hóa: " + tenChuan);
	}
}

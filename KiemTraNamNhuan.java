import java.util.Scanner;

public class KiemTraNamNhuan {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.println("nhập năm cần kiểm tra");
	     int n = scanner.nextInt();
	        
	     if( (n%4 == 0 && n%100 !=0) || n%400 == 0 ){
	            System.out.printf(+n+" là năm nhuận", n);
	     }else{
	            System.out.println(+n+" không phải là năm nhuận");
	        }
	 }
}

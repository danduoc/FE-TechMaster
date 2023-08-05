import java.util.Iterator;
import java.util.Scanner;

public class tongChan {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	           
	     System.out.println("nhập N:");
	     int n = sc.nextInt();
	     
	     int tongChan = 0;
	     int tongLe = 0;
	     for (int i = 1; i <= n; i = i+1) {
	    	 if (i%2==0) {
				tongChan = tongChan + i;
			} else {
				tongLe = tongLe + i;
			}

		}
	     System.out.println("tổng các số chẵn từ 1 đến " +n+ " là: " +tongChan);
	     System.out.println("tổng các số lẻ từ 1 đến " +n+ " là: " +tongLe);
	}
	   
}
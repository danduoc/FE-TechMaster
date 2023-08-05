import java.util.Iterator;
import java.util.Scanner;

public class tichChanLe {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	           
	     System.out.println("nhập N:");
	     int n = sc.nextInt();
	     
	     int tichChan = 1;
	     int tichLe = 1;
	     for (int i = 1; i <= n; i = i+1) {
	    	 if (i%2==0) {
				tichChan = tichChan * i;
			} else {
				tichLe = tichLe * i;
			}

		}
	     System.out.println("tích các số chẵn từ 1 đến " +n+ " là: " +tichChan);
	     System.out.println("tích các số lẻ từ 1 đến " +n+ " là: " +tichLe);
	}
	   
}
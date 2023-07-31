import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("giải phương trình bậc 1: ax + b = 0");
        double a,b,;
        System.out.println("nhập a:");
        a = scanner.nextDouble();
        
        System.out.println("nhập b:");
        b = scanner.nextDouble();

           
           	if(a==0){
                if(b==0){
             	   System.out.println("Pt vô số nghiệm");
                 }else{
     	            System.out.println("Pt vô nghiệm");
                 }
             }else{
             	double x = -b/a;
                 System.out.println("x = " + x);
        	}
    }
}

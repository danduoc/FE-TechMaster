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

           
        if (a==0) {
        	System.out.println("đưa về pt bậc 1");
        	if(b==0){
                if(c==0){
             	   System.out.println("Pt vô số nghiệm");
                 }else{
     	            System.out.println("Pt vô nghiệm");
                 }
             }else{
             	double y = -c/b;
                 System.out.println("x = " + y);
        }}else {
        	double dta = b*b-4*a*c;
        	
        	if (dta<0) {
        		System.out.println("vô nghiệm");
        	}else {
        		if (dta==0){
        			double x = -b*1.0/(2*a);
        			System.out.println("nghiệm kép x1 = x2 = " +x);
        		}else{
        			double x1 = (-b+Math.sqrt(dta))/(2*a);
        			double x2 = (-b-Math.sqrt(dta))/(2*a);
        			System.out.println("nghiệm x1= " +x1);
        			System.out.println("nghiệm x2= " +x2);
        		}
        	}
        }
    }
}

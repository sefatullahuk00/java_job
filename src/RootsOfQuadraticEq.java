import java.util.Scanner; // import Scanner class

public class RootsOfQuadraticEq {
    public static void main(String[] args) {
        double R1,R2;
        double a, b, c, D;

        Scanner sc = new Scanner(System.in);

        //get value of a, b, c
        System.out.println("Enter value for  a, b, and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //set D
        D = (b * b) - (4 * a * c);

        // Set Roots According to the Result of D

        if(D == 0) {
            System.out.println("Roots are Real & Equal");
            R1 = R2 = -b / (2 * a);

        }else if(D > 0) {
            System.out.println("Roots are Real & Distinct"); 
            R1 = -b + Math.sqrt(D) / (2 * a);
            R2 = -b - Math.sqrt(D) / (2 * a);

        }else {
            System.out.println("Roots are Distinct & Imaginary"); 
            R1 = -b / ( 2 * a);
            R2 = Math.sqrt(-D) / (2 * a);

        }

        // Print Roots
        System.out.println("R1 = " + R1);
        System.out.println("R2 = " + R2);
       
    }
}

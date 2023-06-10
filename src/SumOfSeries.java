import java.util.Scanner; //import Scanner class

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //get value for N & convert to integer
        int N;
        System.out.println("Enter a positive Number");
        N = myScanner.nextInt();
        

        int sum = 0;

        for(int i = 0; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even nums from 0 to " + N + " is: " + sum);
    }
}

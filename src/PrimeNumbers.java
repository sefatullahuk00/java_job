//Prime Numbers of N

public class PrimeNumbers {
    public static void main(String[] args) {
        String primeNums = "";
        int num = 100;

        for(int i = 2; i <= num; i++) {
            boolean primeStatus = true;
            //check primenums;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    // i is not prime
                    primeStatus = false;
                    break;
                }
            }

            // if no remainder, i is prime
            if(primeStatus) {
                primeNums = primeNums + i + ",";
            }
        }

        //Print PrimeNums;
        System.out.println(primeNums);
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int p,q,r;
        p = 44;
        q = 33;
        r = 54;

        if(p > q && p > r) {
            System.out.println(p + " is Large");
        }else if(q > p && q > r) {
            System.out.println(q + " is Large");
        }else {
            System.out.println(r + " is Large");
        }
    }
}

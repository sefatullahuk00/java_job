public class Constructor {
    int stdNums;

    public Constructor(int a) {
        stdNums = a;
    }
    public static void main(String[] args) {
        Constructor cnt = new Constructor(4);
        System.out.println(cnt.stdNums);
    }
}

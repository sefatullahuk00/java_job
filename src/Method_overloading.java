class Method_overloading {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
       
      int sum = sum(3, 4,5);
      System.out.println(sum);
    }
}
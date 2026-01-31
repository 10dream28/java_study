package method;

public class methoddemo1    {
    public static void main(String[] args) {
    int add = getsum(10,20);
    System.out.println(add);
    }
    public static int getsum(int a, int b){
        int sum = a + b;
        return sum;
    }

}

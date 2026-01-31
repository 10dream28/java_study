package method;

public class change {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("交换前a="+a+"b="+b);
        change(a,b);
        System.out.println("交换后a="+a+"b="+b);
    }
    public static void change(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

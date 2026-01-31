package method;

public class multable_nocanshu {
    public static void main(String[] args) {
        multable();
    }
    public static void multable(){
        //i确定行数 第二个数
        for (int i = 1; i < 10; i++) {
            //j确定列数 第一个数 确定行的内容
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}

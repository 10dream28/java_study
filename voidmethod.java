package method;

public class voidmethod {
    public static void main(String[] args) {
        //创建数组
    int [] arr={1,2,3,4,5};
    //调用方法
    printarr(arr);
    }
    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}

package method;
import java.util.Random;

public class methoddemo2 {
    //生成不重复的随机数
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int [10];
        //生成不重复的随机数填入数组
        Random r = new Random();
        for(int i = 0; i < arr.length;){
            int num = r.nextInt(1,101);
            //判断num是否在arr中
            //(可简化步骤)boolean flag = contains(num,arr);
            //如果不存在,才继续生成,下标自增
            //(可简化步骤)if(!flag){
            if(!contains(num,arr)){
                arr[i] = num;
                i++;
            }
            //如果存在,就继续在循环里生成随机数
        }
        //输出
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //方法判断num是否存在在arr中
    public static boolean contains(int num,int [] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == num){
                //true表示存在
                //----------------return-------------------------------------------------------------------
                //return 关键字的作用：在有返回值的方法中，return 有两个核心功能
                //向方法的调用者返回指定类型的结果数据
                //立即终止当前方法的执行，方法体内位于该 return 之后的所有代码都不会再被执行（不管是循环内还是循环外）
                return true;
            }
        }
        return false;
    }

}

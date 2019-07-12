package cn.anyglobal.day2;
import java.util.Arrays;
public class PrintArray {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50};

        //打印格式为：[10, 20, 30, 40, 50]
        //使用面向过程，每一个步骤细节都要亲历亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {//如果是最后一个元素
                System.out.println(array[i] + "]");
            } else {//如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==============");

        // 使用面向对象
        // 找一个JDK给我们提供好的Arrays类，
        // 其中有一个toString方法，直接能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}

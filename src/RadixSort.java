import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0,879,78,56,4,15,23,11,47,22,100};
        System.out.println("排序之前:");
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //计算最大数据的位数
        //先将整数转化为字符串，然后调用字符串长度函数
        int maxNumberLength = (max + "").length();
        //创建临时数组来存放数字
        int[][] temp = new int[10][arr.length];
        //记录temp数组中相应位置的数字的数量
        int[] count = new int[10];
        //根据最大数据的位数来决定比较测次数
        for (int i = 0, n = 1; i < maxNumberLength; i++, n *= 10){
            //计算每个数字的余数
            for (int j = 0; j < arr.length; j++){
                //取余数
                int moduleNumber = arr[j]/n%10;
                //将当前遍历的数字放入指定的数组中
                temp[moduleNumber][count[moduleNumber]] = arr[j];
                //记录数量
                count[moduleNumber]++;
            }
            //记录取出的数字所放的位置
            int index = 0;
            //把数字取出来
            for (int k = 0; k < count.length; k++){
                //从计数数组中取出数字
                if (count[k] != 0){
                    //循环取出数字
                    for (int l = 0; l < count[k]; l++){
                        arr[index] = temp[k][l];
                        //记录下一个位置
                        index++;
                    }
                    //将数量置空
                    count[k] = 0;
                }
            }
        }
    }
}

import java.util.Arrays;

public class RadixQueueSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0,879,78,56,4,15,23,11,47,22,100,468,418};
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
        //创建临时队列数组来存放数字
        SeqQueue[] temp = new SeqQueue[10];
        //为队列数组赋值
        for (int i = 0; i < temp.length; i++){
            temp[i] = new SeqQueue(arr.length + 1);
        }
        //根据最大数据的位数来决定比较次数
        for (int i = 0, n = 1; i < maxNumberLength; i++, n *= 10){
            //计算每个数字的余数
            for (int j = 0; j < arr.length; j++){
                //取余数
                int moduleNumber = arr[j]/n%10;
                //将当前遍历的数字放入指定的队列中
                temp[moduleNumber].addQueue(arr[j]);
            }
            //记录取出的数字所放的位置
            int index = 0;
            //从队列数组中把数字取出来
            for (int k = 0; k < temp.length; k++){
                //从队列数组中取出数字
                while (!temp[k].isEmpty()){
                    //取出元素
                    arr[index] = temp[k].getFrontQueue();
                    //记录下一个位置
                    index++;
                }
            }
        }
    }
}

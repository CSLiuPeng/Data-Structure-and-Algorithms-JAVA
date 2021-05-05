import java.util.Arrays;

public class BinaryInsertSort {
    //这般插入排序
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,0,3,4,2,7,9,8,6};
        System.out.println("排序之前:"+ Arrays.toString(arr));
        binaryInsertSort(arr);
        System.out.println("排序之后:"+ Arrays.toString(arr));
    }

    public static void binaryInsertSort(int[] arr){
        int temp;
        int low, high, mid;
        for (int i = 1; i < arr.length; i++){
            temp = arr[i];
            low = 0; high = i - 1;
            while (low <= high){
                mid = (low + high)/2;
                if (temp < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            for (int j = i - 1; j >= high + 1; j-- ){
                arr[j + 1] =arr[j];
            }
            arr[high + 1] = temp;
        }
    }
}

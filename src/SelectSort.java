import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,0,9,6,8,7,0};
        System.out.println("排序之前:"+ Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序之后:"+Arrays.toString(arr));
    }
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i + 1; j <arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

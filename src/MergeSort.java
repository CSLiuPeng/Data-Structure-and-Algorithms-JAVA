import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = new int[]{5,0,1,7,8,4,6,3,9,2};
        System.out.println("����֮ǰ��");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("����֮��");
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high){
        int middle = (high + low)/2;
        if (low < high){
            //�ݹ��������
            mergeSort(arr, low, middle);
            //�ݹ������ұ�
            mergeSort(arr, middle +1, high);
            //���ݹ�����õ��������ߺϲ�
            merge(arr, low, middle, high);
        }

    }

    public static void merge(int[] arr, int low, int middle, int high){
        //�洢�鲢�����ʱ����
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = middle + 1;
        //��¼��ʱ�����д�����ֵ��±�
        int index = 0;
        while (i <= middle && j <= high){
            if (arr[i] < arr[j]){
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //����ʣ�µ�����
        while (j <= high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i <= middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        //����ʱ�����е����ݷŻ�ԭ��������
        for (int k = 0; k < temp.length; ++k){
            arr[k + low] = temp[k];
        }
    }
}

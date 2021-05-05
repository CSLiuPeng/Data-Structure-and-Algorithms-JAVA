import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,1,9,8,6,3,7,2,0,1};
        System.out.println("����ǰ:");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("�����:");
        System.out.println(Arrays.toString(arr));
    }

    //������
    public static void heapSort(int[] arr){
        //��ʼ������λ��Ϊ���һ��Ҷ�ӽڵ�
        int start = (arr.length - 1)/2;
        //�����һ��Ҷ�ӽڵ㿪ʼ����������������
        for (int i = start; i >= 0 ; i--){
            maxHeap(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    //������������Ϊ�󶥶�
    public static void maxHeap(int[] arr, int size, int index){
        //�������ӽڵ�
        int leftNode = 2 * index + 1;
        //�������ӽڵ�
        int rightNode = 2 * index + 2;

        int maxNode = index;
        //���ӽڵ��ֵ���ڸ��ڵ�ʱ����
        if (leftNode < size && arr[leftNode] > arr[maxNode]){
            maxNode = leftNode;
        }
        //���ӽڵ��ֵ���ڸ��ڵ�ʱ����
        if (rightNode < size && arr[rightNode] > arr[maxNode]){
            maxNode = rightNode;
        }
        if (maxNode != index){
            int temp = arr[maxNode];
            arr[maxNode] = arr[index];
            arr[index] = temp;
            //����֮����ܻ��ƻ�ԭ���Ľṹ����Ҫ�ٴε���
            //�ݹ���ý��е���
            maxHeap(arr, size, maxNode);
        }
    }
}

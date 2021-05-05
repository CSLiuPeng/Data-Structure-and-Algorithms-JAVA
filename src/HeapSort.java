import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,1,9,8,6,3,7,2,0,1};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    //堆排序
    public static void heapSort(int[] arr){
        //开始调整的位置为最后一个叶子节点
        int start = (arr.length - 1)/2;
        //从最后一个叶子节点开始遍历，调整二叉树
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

    //将二叉树调整为大顶堆
    public static void maxHeap(int[] arr, int size, int index){
        //建立左子节点
        int leftNode = 2 * index + 1;
        //建立右子节点
        int rightNode = 2 * index + 2;

        int maxNode = index;
        //左子节点的值大于根节点时调整
        if (leftNode < size && arr[leftNode] > arr[maxNode]){
            maxNode = leftNode;
        }
        //右子节点的值大于根节点时调整
        if (rightNode < size && arr[rightNode] > arr[maxNode]){
            maxNode = rightNode;
        }
        if (maxNode != index){
            int temp = arr[maxNode];
            arr[maxNode] = arr[index];
            arr[index] = temp;
            //交换之后可能会破坏原来的结构，需要再次调整
            //递归调用进行调整
            maxHeap(arr, size, maxNode);
        }
    }
}

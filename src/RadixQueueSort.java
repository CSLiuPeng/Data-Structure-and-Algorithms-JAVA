import java.util.Arrays;

public class RadixQueueSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0,879,78,56,4,15,23,11,47,22,100,468,418};
        System.out.println("����֮ǰ:");
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println("����֮��:");
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        //����������ݵ�λ��
        //�Ƚ�����ת��Ϊ�ַ�����Ȼ������ַ������Ⱥ���
        int maxNumberLength = (max + "").length();
        //������ʱ�����������������
        SeqQueue[] temp = new SeqQueue[10];
        //Ϊ�������鸳ֵ
        for (int i = 0; i < temp.length; i++){
            temp[i] = new SeqQueue(arr.length + 1);
        }
        //����������ݵ�λ���������Ƚϴ���
        for (int i = 0, n = 1; i < maxNumberLength; i++, n *= 10){
            //����ÿ�����ֵ�����
            for (int j = 0; j < arr.length; j++){
                //ȡ����
                int moduleNumber = arr[j]/n%10;
                //����ǰ���������ַ���ָ���Ķ�����
                temp[moduleNumber].addQueue(arr[j]);
            }
            //��¼ȡ�����������ŵ�λ��
            int index = 0;
            //�Ӷ��������а�����ȡ����
            for (int k = 0; k < temp.length; k++){
                //�Ӷ���������ȡ������
                while (!temp[k].isEmpty()){
                    //ȡ��Ԫ��
                    arr[index] = temp[k].getFrontQueue();
                    //��¼��һ��λ��
                    index++;
                }
            }
        }
    }
}

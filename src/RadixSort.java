import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{0,879,78,56,4,15,23,11,47,22,100};
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
        //������ʱ�������������
        int[][] temp = new int[10][arr.length];
        //��¼temp��������Ӧλ�õ����ֵ�����
        int[] count = new int[10];
        //����������ݵ�λ���������Ƚϲ����
        for (int i = 0, n = 1; i < maxNumberLength; i++, n *= 10){
            //����ÿ�����ֵ�����
            for (int j = 0; j < arr.length; j++){
                //ȡ����
                int moduleNumber = arr[j]/n%10;
                //����ǰ���������ַ���ָ����������
                temp[moduleNumber][count[moduleNumber]] = arr[j];
                //��¼����
                count[moduleNumber]++;
            }
            //��¼ȡ�����������ŵ�λ��
            int index = 0;
            //������ȡ����
            for (int k = 0; k < count.length; k++){
                //�Ӽ���������ȡ������
                if (count[k] != 0){
                    //ѭ��ȡ������
                    for (int l = 0; l < count[k]; l++){
                        arr[index] = temp[k][l];
                        //��¼��һ��λ��
                        index++;
                    }
                    //�������ÿ�
                    count[k] = 0;
                }
            }
        }
    }
}

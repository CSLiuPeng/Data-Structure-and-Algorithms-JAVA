//ֱ�Ӳ�������
import java.util.Arrays;

public class DirectInsertSort {

	/**
	 * @param args
	 */
	
	public static void DirectInsertSort(int[]arr){
		for(int i = 1; i < arr.length;i++){
			if(arr[i-1]>arr[i]){
				//������ʱ���������浱ǰҪ��ȡ������
				int temp = arr[i];
				int j;
				for(j = i-1; j >=0&&temp < arr[j];j--){
					arr[j+1]=arr[j];
				}
				//��������������ʱ�򣬰���ʱ������ֵ�������Ԫ��
				arr[j+1]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{5,3,2,8,5,9,1,0};
		DirectInsertSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

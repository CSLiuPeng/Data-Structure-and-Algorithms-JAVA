import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{8,5,7,9,1,3,4,2,6,0};
		System.out.println("����֮ǰ�Ľ��:"+Arrays.toString(arr));
		ShellSort(arr);
		System.out.println("����֮��Ľ��:"+Arrays.toString(arr));
	}

	public static void ShellSort(int[] arr) {
		//�������в���
		for(int d = arr.length/2; d > 0; d/=2) {
			//��������Ԫ��
			for(int i = 0; i < arr.length; i++) {
				//���������е�����Ԫ��
				for(int j = i - d; j >= 0; j -= d) {
					if(arr[j] > arr[j + d]) {
						int temp = arr[j];
						arr[j] = arr[j + d];
						arr[j + d] = temp;
					}
				}
			}
		}
	}
}

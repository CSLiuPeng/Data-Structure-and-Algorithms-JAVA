import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{8,5,7,9,1,3,4,2,6,0};
		System.out.println("排序之前的结果:"+Arrays.toString(arr));
		ShellSort(arr);
		System.out.println("排序之后的结果:"+Arrays.toString(arr));
	}

	public static void ShellSort(int[] arr) {
		//遍历所有步长
		for(int d = arr.length/2; d > 0; d/=2) {
			//遍历所有元素
			for(int i = 0; i < arr.length; i++) {
				//遍历本组中的所有元素
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

//直接插入排序
import java.util.Arrays;

public class DirectInsertSort {

	/**
	 * @param args
	 */
	
	public static void DirectInsertSort(int[]arr){
		for(int i = 1; i < arr.length;i++){
			if(arr[i-1]>arr[i]){
				//设置临时变量来保存当前要读取的数字
				int temp = arr[i];
				int j;
				for(j = i-1; j >=0&&temp < arr[j];j--){
					arr[j+1]=arr[j];
				}
				//当不满足条件的时候，把临时变量赋值给后面的元素
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

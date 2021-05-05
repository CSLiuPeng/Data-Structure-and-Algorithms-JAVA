import java.util.Arrays;


public class quickSort1 {

	/**
	 * @param args
	 */
	
	public static void quickSort1(int []arr, int start, int end){
		int stard = arr[start];
		int low = start;
		int high = end;
		if(start < end){
			while(low < high){
				while(high > low && arr[high] >= stard){
					high--;
				}
				arr[low] = arr[high];
				while(low < high && arr[low] <= stard){
					low++;
				}
				arr[high] = arr[low];
			}
			 arr[low] = stard;
			 quickSort1(arr, 0 , low-1);
			 quickSort1(arr, low+1, end);
		}
	}
	
	public static void QuickSort1(int[] arr, int start, int end){
		int guard = arr[start];
		int low = start, high = end;
		int temp;
		if(start < end){
			while(low != high){
				while(high > low && arr[high] >= guard) high--;
				while(low < high && arr[low] <= guard) low++;
				if(low < high){
					temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
				}
			}
			arr[start] = arr[low];
			arr[low] = guard;
			QuickSort1(arr, start, low-1);
			QuickSort1(arr, low+1, end);
		}
	}
	
	//快速排序改进版
	public static void QuickSort2(int[] arr, int start, int end){
		int guard = arr[start];//哨兵元素
		int low = start, high = end;
		if(start < end){
		while(low != high){
			while(high > low && arr[high] >= guard) high--;
			arr[low] = arr[high];
			while(low < high && arr[low] <= guard) low++;
			arr[high] = arr[low];
		}
		arr[low] = guard;
		QuickSort2(arr, start, low-1);
		QuickSort2(arr, low+1, end);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[]{3,4,6,7,2,7,2,8,0};
	
		quickSort1(arr, 0 , arr.length-1);
	//	QuickSort2(arr, 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}

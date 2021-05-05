import java.util.Scanner;


public class QuickSort {

	/**
	 * @param args
	 */
	
	public static void Display(int[] arr, int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	
	//��������
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
	
	//��������Ľ���
	public static void QuickSort2(int[] arr, int start, int end){
		int guard = arr[start];//�ڱ�Ԫ��
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
		System.out.println("��������:");
		Scanner input = new Scanner(System.in);
	
		
		System.out.print("����������Ԫ�صĸ���:");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.print("����������Ԫ��:");
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		
		QuickSort2(arr, 0, (arr.length-1));
		Display(arr, (arr.length));
	}

}

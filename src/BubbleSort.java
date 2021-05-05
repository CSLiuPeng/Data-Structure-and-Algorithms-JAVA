import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 * Andrew Peng Liu
	 */
	
	public static void Display(int[] arr, int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void BubbleSort1(int[]arr, int n){
		boolean exchange;
		int temp; 
		for(int i = 0; i < n-1; i++){
			exchange = false;
			for(int j = n-1; j > i; j--){
				if(arr[j-1] > arr[j]){ //通过改变符号来决定是升序还是降序
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					exchange = true;
				}
			}
			if(!exchange){
				break;
			}
		}
	}
	
	//另一种写法
	public static void BubbleSort2(int[] arr, int n){
		boolean exchange;
		int temp; 
		for(int i = 0; i < n; i++){
			exchange = false;
			for(int j = 1; j < n-i; j++){
				if(arr[j-1] > arr[j]){//通过改变符号来决定是升序还是降序
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					exchange = true;
				}
			}
			if(!exchange){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("冒泡排序:");
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入数组元素的个数:");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.print("请输入数组元素:");
		for(int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		
	//	BubbleSort1(arr, (arr.length));
		BubbleSort2(arr, (arr.length));
		Display(arr, (arr.length));
	}

}

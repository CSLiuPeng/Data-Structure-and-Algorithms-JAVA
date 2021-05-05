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
				if(arr[j-1] > arr[j]){ //ͨ���ı�����������������ǽ���
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
	
	//��һ��д��
	public static void BubbleSort2(int[] arr, int n){
		boolean exchange;
		int temp; 
		for(int i = 0; i < n; i++){
			exchange = false;
			for(int j = 1; j < n-i; j++){
				if(arr[j-1] > arr[j]){//ͨ���ı�����������������ǽ���
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
		System.out.println("ð������:");
		Scanner input = new Scanner(System.in);
		
		System.out.print("����������Ԫ�صĸ���:");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.print("����������Ԫ��:");
		for(int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		
	//	BubbleSort1(arr, (arr.length));
		BubbleSort2(arr, (arr.length));
		Display(arr, (arr.length));
	}

}

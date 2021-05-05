import java.util.Scanner;

public class Search {

	/**
	 * @param args
	 * Andrew Peng Liu
	 */
	
	//˳�����
	public static int SeqSearch(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i + 1;
			}
		}
		return -1;
	}
	
	//�۰���ң����ֲ��ң��ǵݹ�汾
	public static int BinarySearch1(int[] arr,int target){
		int n = arr.length,mid;
		int start = 0, end = n - 1;
		while(start <= end){
			mid = (start + end)/2;
			if(arr[mid] == target){
				return mid + 1;
			}else if(arr[mid] > target){
				end = mid - 1;
			} else{
				start = mid + 1;
			}
		}
		return -1;
	}
	
	//�۰���ң����ֲ��ң��ݹ�汾
	public static int BinarySearch2(int[] arr, int target, int start, int end){
		int mid = (start + end)/2;
		if(arr[mid] == target){
			return mid + 1;
		}else if(arr[mid] > target){
			return BinarySearch2(arr, target, start, mid - 1);
		} else{
			return BinarySearch2(arr, target, mid + 1, end);
		}
	}
	
	//��ֵ���ң������۰���ҵݹ��ĸĽ��õ���������mid�ļ��㷽ʽ���иĽ���
	public static int InsertValueSearch(int[] arr, int target, int start, int end){
		int mid = start+(target-arr[start])/(arr[end]-arr[start])*(end-start);
		if(arr[mid] == target){
			return mid + 1;
		}else if(arr[mid] > target){
			return InsertValueSearch(arr, target, start, mid - 1);
		} else{
			return InsertValueSearch(arr, target, mid + 1, end);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����㷨�ܽ�:");
		Scanner input = new Scanner(System.in);
		
		System.out.print("����������Ԫ�صĸ���:");
		
		//��������
		int n = input.nextInt();
		int[]arr = new int[n];
		
		//����������Ԫ��
		System.out.print("����������Ԫ��:");
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		
		//������Ҫ���ҵĽ��
		System.out.print("������Ҫ���ҵ�Ԫ��:");
		int x = input.nextInt();
		
	//	System.out.println("˳����ҵĽ��:"+SeqSearch(arr,x));
	//	System.out.println("�۰���ң��ǵݹ�棩�Ľ��:"+ BinarySearch1(arr, x));
	//	System.out.println("�۰���ң��ݹ�汾���Ľ��:"+ BinarySearch2(arr, x, 0,(arr.length - 1)));
		System.out.println("��ֵ���ҵĽ��:"+ InsertValueSearch(arr, x, 0,(arr.length - 1)));
	}

}

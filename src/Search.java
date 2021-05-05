import java.util.Scanner;

public class Search {

	/**
	 * @param args
	 * Andrew Peng Liu
	 */
	
	//顺序查找
	public static int SeqSearch(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i + 1;
			}
		}
		return -1;
	}
	
	//折半查找（二分查找）非递归版本
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
	
	//折半查找（二分查找）递归版本
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
	
	//插值查找（对于折半查找递归版的改进得到，将其中mid的计算方式进行改进）
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
		System.out.println("查找算法总结:");
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入数组元素的个数:");
		
		//创建数组
		int n = input.nextInt();
		int[]arr = new int[n];
		
		//请输入数组元素
		System.out.print("请输入数组元素:");
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		
		//请输入要查找的结果
		System.out.print("请输入要查找的元素:");
		int x = input.nextInt();
		
	//	System.out.println("顺序查找的结果:"+SeqSearch(arr,x));
	//	System.out.println("折半查找（非递归版）的结果:"+ BinarySearch1(arr, x));
	//	System.out.println("折半查找（递归版本）的结果:"+ BinarySearch2(arr, x, 0,(arr.length - 1)));
		System.out.println("插值查找的结果:"+ InsertValueSearch(arr, x, 0,(arr.length - 1)));
	}

}

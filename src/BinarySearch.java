import java.util.Scanner;


public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("’€∞Î≤È’“:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		
		int target = input.nextInt();
		int index = -1;
		int begin = 0, end = arr.length - 1;
		while(begin <= end){
			int mid = (begin + end)/2;
			if(arr[mid] == target){
				index = mid;
				break;
			}
			if(arr[mid] > target){
				end = mid - 1;
			} else{
				begin = mid + 1;
			}
		}
		System.out.println("index="+(index + 1));
	}

}

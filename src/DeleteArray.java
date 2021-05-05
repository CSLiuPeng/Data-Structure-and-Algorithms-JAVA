import java.util.Arrays;
import java.util.Scanner;


public class DeleteArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("数组元素的删除:");
		Scanner input = new Scanner(System.in);
		int [] arr = new int[]{9,8,7,6,5,4};
		
		System.out.println(Arrays.toString(arr));
		int dest = input.nextInt();
		int [] newArr = new int[arr.length - 1];
		for(int i = 0; i<newArr.length; i++ ){
			if(i < dest){
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i + 1];
			}
		}
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}

}

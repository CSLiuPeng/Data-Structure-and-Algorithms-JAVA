import java.util.Scanner;


public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2.1数组的基本使用:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr1 = new int[n];
		int length1 = arr1.length;
		//输入数组元素
		for(int i = 0; i < length1; i++){
			arr1[i] = input.nextInt();
		}
		//数组元素的输出
		for(int i = 0; i < length1; i++){
			System.out.println("arr1["+i+"]="+arr1[i]*10);
		}
	}

}

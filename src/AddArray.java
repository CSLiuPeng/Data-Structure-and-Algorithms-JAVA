import java.util.Arrays;


public class AddArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2.2数组元素的添加：");
		int[] arr = new int[]{4,5,6};
		int dest = 7;
		System.out.println(Arrays.toString(arr));
		
		int[] newArr = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		newArr[arr.length] = dest;
		arr = newArr;
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));
	}

}

import java.util.Scanner;


public class LinerSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2.5���Բ���:");
		int [] arr = new int[]{1,3,5,7,9,0,4,6,2,8};
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		int index = -1;
		for(int i = 0; i < arr.length; i++ ){
			if(arr[i] == target){
				index = i;
				break;
			}
		}
	System.out.println("��Ԫ���������е�λ����:"+(index+1));
	}

}

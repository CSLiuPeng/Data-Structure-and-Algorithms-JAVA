
public class TestBinaryTreeByArray {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5,6,7,8,9,0};
        BinaryTreeByArray binaryTreeByArray = new BinaryTreeByArray(data);
        binaryTreeByArray.preOrder();
    }
}

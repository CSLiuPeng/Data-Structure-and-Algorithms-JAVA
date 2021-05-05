public class BinaryTreeByArray {
    int[] data;
    public BinaryTreeByArray(int[] data){
        this.data = data;
    }

    public void preOrder(){
       preOrder(0);
    }

    public void preOrder(int index){
        if (data == null || data.length == 0){
            return;
        }

        //输出当前节点的内容
        System.out.println(data[index]);

        //遍历左子树
        if (2 * index + 1 < data.length){
            preOrder(2 * index + 1);
        }
        //遍历右子树
        if (2 * index + 2 < data.length){
            preOrder(2 * index + 2);
        }
    }
}

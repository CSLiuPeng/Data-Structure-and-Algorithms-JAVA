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

        //�����ǰ�ڵ������
        System.out.println(data[index]);

        //����������
        if (2 * index + 1 < data.length){
            preOrder(2 * index + 1);
        }
        //����������
        if (2 * index + 2 < data.length){
            preOrder(2 * index + 2);
        }
    }
}

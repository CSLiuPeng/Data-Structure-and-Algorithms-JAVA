public class TestThreadBinaryTree {
    public static void main(String[] args) {
        ThreadBinaryTree binaryTree = new ThreadBinaryTree();
        //������һ����ڵ�
        ThreadNode root = new ThreadNode(1);
        binaryTree.setRoot(root);

        //�����ڶ���ڵ�
        ThreadNode leftNode2 = new ThreadNode(2);
        root.setLeftNode(leftNode2);
        ThreadNode rightNode2 = new ThreadNode(3);
        root.setRightNode(rightNode2);

        //������3��ڵ�
        leftNode2.setLeftNode(new ThreadNode(4));
        ThreadNode nodeFive = new ThreadNode(5);
        leftNode2.setRightNode(nodeFive);

        rightNode2.setLeftNode(new ThreadNode(6));
        rightNode2.setRightNode(new ThreadNode(7));

//        System.out.println("�������Ĳ���:");
//        ThreadNode searchResult = binaryTree.preOrderSearch(5);
//        System.out.println(searchResult);
        System.out.println("�������������:");
        binaryTree.midOrder();

        System.out.println("����������������:");
        binaryTree.threadNodes();
        binaryTree.threadterator();;


    }

}

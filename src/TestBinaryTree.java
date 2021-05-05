public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        //������һ����ڵ�
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        //�����ڶ���ڵ�
        TreeNode leftNode2 = new TreeNode(2);
        root.setLeftNode(leftNode2);
        TreeNode rightNode2 = new TreeNode(3);
        root.setRightNode(rightNode2);

        //������3��ڵ�
        leftNode2.setLeftNode(new TreeNode(4));
        leftNode2.setRightNode(new TreeNode(5));

        rightNode2.setLeftNode(new TreeNode(6));
        rightNode2.setRightNode(new TreeNode(7));

//        System.out.println("�������:");
//        binaryTree.preOrder();
//
//        System.out.println("�������:");
//        binaryTree.midOrder();
//
//        System.out.println("�������:");
//        binaryTree.postOrder();

        System.out.println("�������Ĳ���:");
        TreeNode searchResult = binaryTree.preOrderSearch(5);
        System.out.println(searchResult);

        System.out.println("��������ɾ��:");
        binaryTree.delete(1);
        binaryTree.postOrder();

    }
}

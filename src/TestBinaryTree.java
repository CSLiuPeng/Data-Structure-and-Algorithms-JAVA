public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        //创建第一层根节点
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        //创建第二层节点
        TreeNode leftNode2 = new TreeNode(2);
        root.setLeftNode(leftNode2);
        TreeNode rightNode2 = new TreeNode(3);
        root.setRightNode(rightNode2);

        //创建第3层节点
        leftNode2.setLeftNode(new TreeNode(4));
        leftNode2.setRightNode(new TreeNode(5));

        rightNode2.setLeftNode(new TreeNode(6));
        rightNode2.setRightNode(new TreeNode(7));

//        System.out.println("先序遍历:");
//        binaryTree.preOrder();
//
//        System.out.println("中序遍历:");
//        binaryTree.midOrder();
//
//        System.out.println("后序遍历:");
//        binaryTree.postOrder();

        System.out.println("二叉树的查找:");
        TreeNode searchResult = binaryTree.preOrderSearch(5);
        System.out.println(searchResult);

        System.out.println("二叉树的删除:");
        binaryTree.delete(1);
        binaryTree.postOrder();

    }
}

public class TestThreadBinaryTree {
    public static void main(String[] args) {
        ThreadBinaryTree binaryTree = new ThreadBinaryTree();
        //创建第一层根节点
        ThreadNode root = new ThreadNode(1);
        binaryTree.setRoot(root);

        //创建第二层节点
        ThreadNode leftNode2 = new ThreadNode(2);
        root.setLeftNode(leftNode2);
        ThreadNode rightNode2 = new ThreadNode(3);
        root.setRightNode(rightNode2);

        //创建第3层节点
        leftNode2.setLeftNode(new ThreadNode(4));
        ThreadNode nodeFive = new ThreadNode(5);
        leftNode2.setRightNode(nodeFive);

        rightNode2.setLeftNode(new ThreadNode(6));
        rightNode2.setRightNode(new ThreadNode(7));

//        System.out.println("二叉树的查找:");
//        ThreadNode searchResult = binaryTree.preOrderSearch(5);
//        System.out.println(searchResult);
        System.out.println("中序遍历二叉树:");
        binaryTree.midOrder();

        System.out.println("中序线索化二叉树:");
        binaryTree.threadNodes();
        binaryTree.threadterator();;


    }

}

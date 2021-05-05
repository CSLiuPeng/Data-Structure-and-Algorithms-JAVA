public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    //前序遍历
    public void preOrder(){
        if (root != null){
            root.preOrder();
        }
    }
    //中序遍历
    public void midOrder(){
        if (root != null){
            root.midOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (root != null){
            root.postOrder();
        }
    }

    public TreeNode preOrderSearch(int i){
        return root.preOrderSearch(i);
    }

    public void delete(int i) {
        if (root.value == i){
            root = null;
        } else{
            root.delete(i);
        }
    }
}

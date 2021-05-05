public class ThreadBinaryTree {
    ThreadNode root;

    //存储前驱节点
    ThreadNode pre = null;

    public void setRoot(ThreadNode root) {
        this.root = root;
    }

    public ThreadNode getRoot() {
        return root;
    }

    //中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }

    public void threadNodes(ThreadNode threadNode){
        if (threadNode == null){
            return;
        }

        //处理左子树
        threadNodes(threadNode.leftNode);
        if (threadNode.leftNode == null){
            threadNode.leftNode = pre;
            threadNode.leftType = 1;
        }

        if (pre != null && pre.rightNode != null){
            pre.rightNode = threadNode;
            pre.rightType = 1;
        }

        pre = threadNode;
        //处理右子树
        threadNodes(threadNode.rightNode);
    }

    //线索遍历二叉树
    public void threadterator(){
        ThreadNode threadNode = root;
        while (threadNode != null){
            while (threadNode.leftType == 0){
                threadNode = threadNode.leftNode;
            }
            //打印当前节点的值
            System.out.println(threadNode.value);
            while (threadNode.rightType == 1){
                threadNode = threadNode.rightNode;
                System.out.println(threadNode.value);
            }
            threadNode = threadNode.rightNode;
        }
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

    public ThreadNode preOrderSearch(int i){
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

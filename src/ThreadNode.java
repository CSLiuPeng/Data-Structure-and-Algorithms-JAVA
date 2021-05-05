public class ThreadNode {
    int value;
    ThreadNode leftNode;
    ThreadNode rightNode;

    int leftType;
    int rightType;

    public ThreadNode(int value){
        this.value = value;
    }


    public void setLeftNode(ThreadNode leftNode) {
        this.leftNode = leftNode;
    }


    public void setRightNode(ThreadNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历
    public void preOrder(){
        System.out.println(value);
        if (leftNode != null){
            leftNode.preOrder();
        }
        if (rightNode != null){
            rightNode.preOrder();;
        }
    }
    //中序遍历
    public void midOrder(){
        if (leftNode != null){
            leftNode.midOrder();
        }
        System.out.println(value);
        if (rightNode != null){
            rightNode.midOrder();;
        }
    }
    //后序遍历
    public void postOrder(){
        if (leftNode != null){
            leftNode.postOrder();
        }
        if (rightNode != null){
            rightNode.postOrder();;
        }
        System.out.println(value);
    }

    //前序查找
    public ThreadNode preOrderSearch(int i){
        ThreadNode targetNode = null;
        if (this.value == i){
            return this;
        } else {
            if (leftNode != null){
                targetNode = leftNode.preOrderSearch(i);
            }
            if (targetNode != null){
                return targetNode;
            }
            if (rightNode != null){
                targetNode = rightNode.preOrderSearch(i);
            }
            return targetNode;
        }
    }

    public void delete(int i) {
        ThreadNode parent = this;
        if (parent.leftNode != null && parent.leftNode.value == i){
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode != null && parent.rightNode.value == i){
            parent.rightNode = null;
            return;
        }
        //递归检查并且删除左孩子
        parent = leftNode;
        if (parent != null){
            parent.delete(i);
        }
        //递归检查并且删除右孩子
        parent = rightNode;
        if (parent != null){
            parent.delete(i);
        }
    }
}

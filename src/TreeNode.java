public class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int value){
        this.value = value;
    }


    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }


    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    //ǰ�����
    public void preOrder(){
        System.out.println(value);
        if (leftNode != null){
            leftNode.preOrder();
        }
        if (rightNode != null){
            rightNode.preOrder();;
        }
    }
    //�������
    public void midOrder(){
        if (leftNode != null){
            leftNode.midOrder();
        }
        System.out.println(value);
        if (rightNode != null){
            rightNode.midOrder();;
        }
    }
    //�������
    public void postOrder(){
        if (leftNode != null){
            leftNode.postOrder();
        }
        if (rightNode != null){
            rightNode.postOrder();;
        }
        System.out.println(value);
    }

    //ǰ�����
    public TreeNode preOrderSearch(int i){
        TreeNode targetNode = null;
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
        TreeNode parent = this;
        if (parent.leftNode != null && parent.leftNode.value == i){
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode != null && parent.rightNode.value == i){
            parent.rightNode = null;
            return;
        }
        //�ݹ��鲢��ɾ������
        parent = leftNode;
        if (parent != null){
            parent.delete(i);
        }
        //�ݹ��鲢��ɾ���Һ���
        parent = rightNode;
        if (parent != null){
            parent.delete(i);
        }
    }
}

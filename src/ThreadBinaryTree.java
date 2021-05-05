public class ThreadBinaryTree {
    ThreadNode root;

    //�洢ǰ���ڵ�
    ThreadNode pre = null;

    public void setRoot(ThreadNode root) {
        this.root = root;
    }

    public ThreadNode getRoot() {
        return root;
    }

    //����������������
    public void threadNodes(){
        threadNodes(root);
    }

    public void threadNodes(ThreadNode threadNode){
        if (threadNode == null){
            return;
        }

        //����������
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
        //����������
        threadNodes(threadNode.rightNode);
    }

    //��������������
    public void threadterator(){
        ThreadNode threadNode = root;
        while (threadNode != null){
            while (threadNode.leftType == 0){
                threadNode = threadNode.leftNode;
            }
            //��ӡ��ǰ�ڵ��ֵ
            System.out.println(threadNode.value);
            while (threadNode.rightType == 1){
                threadNode = threadNode.rightNode;
                System.out.println(threadNode.value);
            }
            threadNode = threadNode.rightNode;
        }
    }

    //ǰ�����
    public void preOrder(){
        if (root != null){
            root.preOrder();
        }
    }
    //�������
    public void midOrder(){
        if (root != null){
            root.midOrder();
        }
    }
    //�������
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

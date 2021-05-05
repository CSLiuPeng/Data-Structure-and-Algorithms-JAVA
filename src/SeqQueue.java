public class SeqQueue {
    private int maxSize; // ��ʾ������������
    private int front; // ��ͷ
    private int rear; // ��β
    private int[] arr; // ���������ڴ������, ģ�����

    // ���еĹ�����
    public SeqQueue(int maxSize) {
        front = -1; // ָ�����ͷ��
        rear = -1; // ָ�����β
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    // �ж϶����Ƿ���
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // �ж϶����Ƿ�Ϊ��
    public boolean isEmpty() {
        return rear == front;
    }

    // ��������������
    public void addQueue(int n) {
        // �ж϶����Ƿ���
        if (isFull()) {
            System.out.println("�����������ܼ�������~");
            return;
        }
        rear++; // ��rear ����
        arr[rear] = n;
    }

    // ��ȡ���е�����, ������
    public int getFrontQueue() {
        // �ж϶����Ƿ��
        if (isEmpty()) {
            // ͨ���׳��쳣
            throw new RuntimeException("���пգ�����ȡ����");
        }
        front++; // front����
        return arr[front];

    }

    // ��ʾ���е���������
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("���пյģ�û������~~");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    // ��ʾ���е�ͷ���ݣ�����ȡ������
    public int headQueue() {
        // �ж�
        if (isEmpty()) {
            throw new RuntimeException("���пյģ�û������~~");
        }
        return arr[front + 1];
    }
}

public class CycleQueue {
    private int maxSize; // ��ʾ������������
    //front �����ĺ�����һ�������� front ��ָ����еĵ�һ��Ԫ��, Ҳ����˵ arr[front] ���Ƕ��еĵ�һ��Ԫ�� front �ĳ�ʼֵ = 0
    private int front;
    //rear �����ĺ�����һ��������rear ָ����е����һ��Ԫ�صĺ�һ��λ��. ��Ϊϣ���ճ�һ���ռ���ΪԼ��.rear �ĳ�ʼֵ = 0
    private int rear;
    private int[] arr; // ���������ڴ������, ģ�����

    //���캯����������ʼ��
    public CycleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    // �ж϶����Ƿ���
    public boolean isFull() {
        return (rear  + 1) % maxSize == front;
    }

    // �ж϶����Ƿ�Ϊ��
    public boolean isEmpty() {
        return rear == front;
    }

    // ������ݵ�����
    public void addCycleQueue(int n) {
        // �ж϶����Ƿ���
        if (isFull()) {
            System.out.println("���������޷��������");
            return;
        }
        //ֱ�ӽ����ݼ���
        arr[rear] = n;
        //�� rear ����
        rear = (rear + 1) % maxSize;
    }

    // ��ȡ���е�����, ������
    public int getCycleQueue() {
        // �ж϶����Ƿ��
        if (isEmpty()) {
            throw new RuntimeException("���пգ�����ȡ����");
        }
        // front��ָ����еĵ�һ��Ԫ��
        // 1. �Ȱ� front ��Ӧ��ֵ������һ����ʱ����
        // 2. �� front ����, ����ȡģ
        // 3. ����ʱ����ı�������
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;

    }

    // ��ʾ���е���������
    public void showAllCycleQueue() {
        if (isEmpty()) {
            System.out.println("���пյ�,�޷���ʾ����");
            return;
        }
        for (int i = front; i < front + size() ; i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    // �����ǰ������Ч���ݵĸ���
    public int size() {
        // rear = 2
        // front = 1
        // maxSize = 3
        return (rear + maxSize - front) % maxSize;
    }

    // ��ʾ���е�ͷ���ݣ� ע�ⲻ��ȡ������
    public int showFrontCycleQueue() {
        // �ж�
        if (isEmpty()) {
            throw new RuntimeException("���пյģ��޷�����");
        }
        return arr[front];
    }
}

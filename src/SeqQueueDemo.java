public class SeqQueueDemo {
    public static void main(String[] args) {
        //��������
        SeqQueue seqQueue = new SeqQueue(5);
        System.out.println("---------����������Ԫ��-------------------");
        seqQueue.addQueue(1);
        seqQueue.addQueue(2);
        seqQueue.addQueue(3);
        seqQueue.addQueue(4);
        seqQueue.addQueue(5);
        System.out.println("--------------��ʾ�����е�����Ԫ��----------------------");
        seqQueue.showQueue();
        System.out.println("--------------�ж϶ӿ�----------------------");
        System.out.println(seqQueue.isEmpty());
        System.out.println("--------------�ж϶���----------------------");
        System.out.println(seqQueue.isFull());
        System.out.println("--------------��ʾ��ͷԪ��----------------------");
        System.out.println(seqQueue.headQueue());
        System.out.println("--------------����Ԫ�س���----------------------");
        System.out.println(seqQueue.getFrontQueue());

    }
}

public class SeqQueueDemo {
    public static void main(String[] args) {
        //测试用例
        SeqQueue seqQueue = new SeqQueue(5);
        System.out.println("---------向队列中添加元素-------------------");
        seqQueue.addQueue(1);
        seqQueue.addQueue(2);
        seqQueue.addQueue(3);
        seqQueue.addQueue(4);
        seqQueue.addQueue(5);
        System.out.println("--------------显示队列中的所有元素----------------------");
        seqQueue.showQueue();
        System.out.println("--------------判断队空----------------------");
        System.out.println(seqQueue.isEmpty());
        System.out.println("--------------判断队满----------------------");
        System.out.println(seqQueue.isFull());
        System.out.println("--------------显示队头元素----------------------");
        System.out.println(seqQueue.headQueue());
        System.out.println("--------------队首元素出队----------------------");
        System.out.println(seqQueue.getFrontQueue());

    }
}

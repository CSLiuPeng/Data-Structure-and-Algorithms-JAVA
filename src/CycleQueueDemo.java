public class CycleQueueDemo {
    public static void main(String[] args) {
        CycleQueue cycleQueue = new CycleQueue(5);
        System.out.println("---------向队列中添加元素-------------------");
        cycleQueue.addCycleQueue(1);
        cycleQueue.addCycleQueue(2);
        cycleQueue.addCycleQueue(3);
        cycleQueue.addCycleQueue(4);
        System.out.println("--------------显示队列中的所有元素----------------------");
        cycleQueue.showAllCycleQueue();
        System.out.println("--------------判断队空----------------------");
        System.out.println(cycleQueue.isEmpty());
        System.out.println("--------------判断队满----------------------");
        System.out.println(cycleQueue.isFull());
        System.out.println("--------------显示队头元素----------------------");
        System.out.println(cycleQueue.showFrontCycleQueue());
        System.out.println("--------------队首元素出队----------------------");
        System.out.println(cycleQueue.getCycleQueue());
    }
}

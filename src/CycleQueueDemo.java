public class CycleQueueDemo {
    public static void main(String[] args) {
        CycleQueue cycleQueue = new CycleQueue(5);
        System.out.println("---------����������Ԫ��-------------------");
        cycleQueue.addCycleQueue(1);
        cycleQueue.addCycleQueue(2);
        cycleQueue.addCycleQueue(3);
        cycleQueue.addCycleQueue(4);
        System.out.println("--------------��ʾ�����е�����Ԫ��----------------------");
        cycleQueue.showAllCycleQueue();
        System.out.println("--------------�ж϶ӿ�----------------------");
        System.out.println(cycleQueue.isEmpty());
        System.out.println("--------------�ж϶���----------------------");
        System.out.println(cycleQueue.isFull());
        System.out.println("--------------��ʾ��ͷԪ��----------------------");
        System.out.println(cycleQueue.showFrontCycleQueue());
        System.out.println("--------------����Ԫ�س���----------------------");
        System.out.println(cycleQueue.getCycleQueue());
    }
}

package UC1;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printMyNode();

        myQueue.dequeue();
    }
}

package UC1;

public class Queue<K> {

    public INode<K> head;
    public INode<K> tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public INode<K> peek() {
        return head;
        }

    public INode<K> pop(){
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }


    public void printMyNode() {
        System.out.println("My Nodes : " + head);
    }
}


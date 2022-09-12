package UC1;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyNode();

        myStack.pop();
        System.out.println("peak : "+myStack.peek());
        myStack.pop();
        System.out.println("peak : "+myStack.peek());
        myStack.pop();
        System.out.println("peak : "+myStack.peek());

    }
}

import java.util.*;

class Traversal {

    public static void main(String[] args) {

    }    

    public static void BFStraversal(Node head) {
        
        Queue<Node> myQueue = new LinkedList<Node>();
        myQueue.add(head);
        Node currentNode = new Node();
        
        while (!myQueue.isEmpty()) {
            currentNode = myQueue.remove();
            System.out.println(currentNode.getData());
            if (currentNode.getLeft() != null) {
                myQueue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                myQueue.add(currentNode.getRight());
            }
        }
    }

    public static void DFStraversal(Node head) {

        Stack<Node> myStack = new Stack<>();
        myStack.add(head);
        Node currentNode = new Node();

        while (!myStack.isEmpty()) {
            currentNode = myStack.pop(); 
            System.out.println(currentNode.getData());
            if (currentNode.getLeft() != null) {
                myStack.push(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                myStack.push(currentNode.getRight());
            }
        }
    }

}
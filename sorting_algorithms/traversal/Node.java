class Node {

    private int data;
    private Node left;
    private Node right;

    public Node() {
        
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setData(int d) {
        this.data = d;
    }

    public void setLeft(Node n){
        this.left = n;
    }

    public void setRight(Node n){
        this.right = n;
    }

}
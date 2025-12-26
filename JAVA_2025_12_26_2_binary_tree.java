class Node{
    private int data;
    private Node left;
    private Node right;

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
class Tree{
    Node root;

    public void insert(int num){
        root=insertRoot(root,num);
    }

    private Node insertRoot(Node root, int num) {
        if(root==null){
            Node n=new Node();
            n.setData(num);
            root=n;
        }else{
            if(root.getData()>num){
                root.setLeft(insertRoot(root.getLeft(), num));
            }else if(root.getData()<num){
                root.setRight(insertRoot(root.getRight(), num));
            }
        }
        return root;
    }

    public void inorder(){
        inorderroot(root);
    }

    private void inorderroot(Node root) {
        if(root!=null){
            inorderroot(root.getLeft());
            System.out.print(root.getData()+"->");
            inorderroot(root.getRight());
        }
    }
}  

public class JAVA_2025_12_26_2_binary_tree {
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insert(1);
        t.insert(3);
        t.insert(2);
        t.insert(13);
        t.insert(6);
        t.insert(15);
        t.insert(4);
        t.inorder();
    }
}

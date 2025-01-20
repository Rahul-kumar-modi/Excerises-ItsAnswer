class Node {
    int value;
    Node left, right;

    public Node(int value){
        this.value = value;
        left = right = null;
    }
}

public class BST {
     Node root;

     public int findMin(Node node) {
        if(node == null){
            throw new IllegalArgumentException("Tree is Empty");
        }

        Node current = node;
        while(current.left !=null){
            current = current.left;
        }
        return current.value;
     }

     public int findMax(Node node) {
        if(node == null){
            throw new IllegalArgumentException("Tree is Empty");
        }

        Node current = node;
        while(current.right !=null){
            current = current.right;
        }
        return current.value;
     }

     public static void main(String[] args){
        BST tree = new BST();

        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(15);
        tree.root.right.right = new Node(40);

        System.out.println("Min val in BST: " +tree.findMin(tree.root));
        System.out.println("Max val in BST: " +tree.findMax(tree.root));
     }
}




package mnc.sec;

// Declaring BST
class Node {
    int key;
    Node leftnode, rightnode;

    public Node(int key) {
        this.key = key;
        this.leftnode = this.rightnode = null;
    }
}

public class Main {

    private Node node;

    // Inserting node
    static Node insert(Node root, int key) {
        Node newNode = new Node(key);
        Node data = root;
        Node point = null; // point has a pointer to data
        while (data != null) {
            point = data;
            if (key < data.key)
                data = data.leftnode;
            else if (key > data.key)
                data = data.rightnode;
            else {
                System.out.println("Value already exists");
                return root; // Return the root unchanged if the value already exists
            }
        }
        if (point == null)
            return newNode; // If the tree is empty, return the new node as the root
        // if key is less than new node, assign to left child
        else if (key < point.key)
            point.leftnode = newNode;
        // if key is greater than new node, assign to right child
        else
            point.rightnode = newNode;
        // Return the root of the modified tree
        return root;
    }

    // In-order traversal
    static void inOrder(Node root) {
        if (root == null)
            return;
        else {
            inOrder(root.leftnode);
            System.out.println(root.key + " ");
            inOrder(root.rightnode);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();

        // Insert values into the tree
        tree.node = insert(tree.node, 50);
        insert(tree.node, 30);
        insert(tree.node, 60);
        insert(tree.node, 10);
        insert(tree.node, 55);

        // Print the tree in-order
        inOrder(tree.node);
    }
}

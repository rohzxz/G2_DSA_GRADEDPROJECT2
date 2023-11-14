class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    Node node;

    // Function to convert BST to skewed tree
    public Node convertToSkewedTree(Node root) {
        // Base Case
        if (root == null) {
            return null;
        }

        // Initialize current and right pointers
        Node curr = root;
        Node right = null;

        // Traverse the tree
        while (curr != null) {
            // If there is a left child, then make it right
            if (curr.left != null) {
                Node left = curr.left;
                curr.left = null;
                curr = left;
            } else {
                // Otherwise, process the current node
                System.out.print(curr.data + " ");

                // Move to the right
                right = curr.right;
                curr = right;
            }
        }

        return right; // The rightmost node becomes the new root
    }

    // Inorder traversal to display the node values in ascending order
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Hardcoding the provided tree
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        // Convert BST to skewed tree and display in ascending order
        System.out.println("Original Inorder Traversal:");
        tree.inOrderTraversal(tree.node);

        System.out.println("\n\nNode values after converting to skewed tree:");
        tree.convertToSkewedTree(tree.node);
    }
}

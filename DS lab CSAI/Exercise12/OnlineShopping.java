class Node {
    String product;
    int price;
    Node left, right;

    Node(String product, int price) {
        this.product = product;
        this.price = price;
        left = right = null;
    }
}

class OnlineShopping {

    // In-order: Left -> Root -> Right
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.product + " - " + root.price);
            inOrder(root.right);
        }
    }

    // Pre-order: Root -> Left -> Right
    void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.product + " - " + root.price);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Post-order: Left -> Right -> Root
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.product + " - " + root.price);
        }
    }

    public static void main(String[] args) {

        Node root = new Node("Laptop", 50000);

        root.left = new Node("Mobile", 20000);
        root.right = new Node("Headphones", 3000);

        root.left.left = new Node("Keyboard", 1500);
        root.left.right = new Node("Mouse", 800);

        OnlineShopping obj = new OnlineShopping();

        System.out.println("IN-ORDER:");
        obj.inOrder(root);

        System.out.println("\nPRE-ORDER:");
        obj.preOrder(root);

        System.out.println("\nPOST-ORDER:");
        obj.postOrder(root);
    }
}
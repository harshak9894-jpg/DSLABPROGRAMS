class ProductNode {
    String productName;
    int price;

    ProductNode left;
    ProductNode right;

    ProductNode(String productName, int price) {
        this.productName = productName;
        this.price = price;
        this.left = null;
        this.right = null;
    }
}

public class inorder {
    static void inorder(ProductNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.productName + "----->" + root.price);
        inorder(root.right);
    }

    public static void main(String[] args) {
        ProductNode root = new ProductNode("Laptop", 50000);
        root.left = new ProductNode("Mobile", 20000);
        root.right = new ProductNode("Tablet", 30000);
        root.left.left = new ProductNode("Headphones", 2000);
        root.left.right = new ProductNode("Charger", 1000);
        root.right.right = new ProductNode("Smartwatch", 5000);

        System.out.println("Product from Lowest to Highest Price");
        System.out.println("=====================================");
        inorder(root);
    }
}
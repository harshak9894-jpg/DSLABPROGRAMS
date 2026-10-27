import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] productIds = new int[n];
        String[] productNames = new String[n];
        double[] prices = new double[n];

        // Get product details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            productIds[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            productNames[i] = sc.nextLine();

            System.out.print("Product Price: ");
            prices[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Search for a product
        System.out.print("\nEnter Product ID to search: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (productIds[i] == key) {
                position = i;
                break;
            }
        }

        // Display the matching product details
        if (position != -1) {

            System.out.println("\nProduct Found!");

            System.out.println("Product ID: "
                    + productIds[position]);

            System.out.println("Product Name: "
                    + productNames[position]);

            System.out.println("Product Price: Rs. "
                    + prices[position]);

        } else {
            System.out.println("Product not found!");
        }

        sc.close();
    }
}
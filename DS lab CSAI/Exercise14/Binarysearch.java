import java.util.Scanner;

class ProductBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] productId = new int[n];
        String[] productName = new String[n];
        double[] price = new double[n];

        // Get product details in sorted Product ID order
        System.out.println("\nEnter Product details in SORTED Product ID order:");

        for (int i = 0; i < n; i++) {

            System.out.println("\nProduct " + (i + 1));

            System.out.print("Enter Product ID: ");
            productId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            productName[i] = sc.nextLine();

            System.out.print("Enter Price: ");
            price[i] = sc.nextDouble();
        }

        // Find first, middle and last index
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low) / 2;

        System.out.println("\n--- MIDDLE PRODUCT ---");
        System.out.println("Low Index: " + low);
        System.out.println("Middle Index: " + mid);
        System.out.println("Middle Product ID: " + productId[mid]);
        System.out.println("Middle Product Name: " + productName[mid]);
        System.out.println("Middle Product Price: Rs. " + price[mid]);

        // Search Product
        System.out.print("\nEnter Product ID to Search: ");
        int searchId = sc.nextInt();

        int foundIndex = -1;

        // Binary Search
        while (low <= high) {

            mid = low + (high - low) / 2;

            System.out.println("\nProduct Checking...");
            System.out.println("Product ID: " + productId[mid]);
            System.out.println("Product Name: " + productName[mid]);
            System.out.println("Product Price: Rs. " + price[mid]);

            if (productId[mid] == searchId) {

                foundIndex = mid;
                break;

            } else if (searchId > productId[mid]) {

                System.out.println("Moving to RIGHT half...");
                low = mid + 1;

            } else {

                System.out.println("Moving to LEFT half...");
                high = mid - 1;
            }
        }

        // Display search result
        if (foundIndex != -1) {

            System.out.println("\nProduct Found!");
            System.out.println("Product ID: " + productId[foundIndex]);
            System.out.println("Product Name: " + productName[foundIndex]);
            System.out.println("Product Price: Rs. " + price[foundIndex]);

        } else {

            System.out.println("\nProduct not found!");
        }

        sc.close();
    }
}
import java.util.Scanner;

class ShoppingCartStack {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Shopping Cart Capacity: ");
        int size = sc.nextInt();
        sc.nextLine();

        String cart[] = new String[size];

        int top = -1;
        int choice;

        do {
            System.out.println("\n========= SHOPPING CART ==========");
            System.out.println("1. Push - Add Product");
            System.out.println("2. Pop - Remove Last Added Product");
            System.out.println("3. Peek - View Last Added Product");
            System.out.println("4. Display - View All Products");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Push operation
                case 1:
                    System.out.print("\nHow many Products do you want to add to the cart? ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    // Check stack overflow
                    if (top + n >= size) {
                        System.out.println("\nStack Overflow!");
                        System.out.println("Only " + (size - top - 1)
                                + " product(s) can be added.");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter Product " + (i + 1) + ": ");

                            String product = sc.nextLine();

                            top++;
                            cart[top] = product;
                        }

                        System.out.println("\nProducts added successfully!");
                    }
                    break;

                // Pop operation
                case 2:
                    if (top == -1) {
                        System.out.println("\nStack Underflow!");
                        System.out.println("The shopping cart is empty.");
                    } else {
                        System.out.println("\nPopped Product: " + cart[top]);
                        cart[top] = null;
                        top--;
                    }
                    break;

                // Peek operation
                case 3:
                    if (top == -1) {
                        System.out.println("\nStack is Empty!");
                    } else {
                        System.out.println("\nTop Product: " + cart[top]);
                    }
                    break;

                // Display operation
                case 4:
                    if (top == -1) {
                        System.out.println("\nStack is Empty!");
                    } else {
                        System.out.println("\n===== STACK DISPLAY =====");

                        for (int i = top; i >= 0; i--) {
                            System.out.println(cart[i]);
                        }
                    }
                    break;

                // Exit operation
                case 5:
                    System.out.println(
                            "\nThank you for using the Shopping Cart Stack!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
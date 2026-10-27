import java.util.Scanner;

public class sales3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------Year---------
        System.out.println("Enter the no. of year:");
        int y = sc.nextInt();
        sc.nextLine();

        String[] year = new String[y];
        for (int i = 0; i < y; i++) {
            System.out.println("Enter Year " + (i + 1) + ":");
            year[i] = sc.nextLine();
        }

        //---------Product-----------
        System.out.println("Enter the no. of Product:");
        int p = sc.nextInt();
        sc.nextLine();

        String[] product = new String[p];
        for (int i = 0; i < p; i++) {
            System.out.println("Enter Product " + (i + 1) + ":");
            product[i] = sc.nextLine();
        }

        //------------Branch----------------
        System.out.println("Enter the no. of Branch:");
        int b = sc.nextInt();
        sc.nextLine();

        String[] branch = new String[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Enter Branch " + (i + 1) + ":");
            branch[i] = sc.nextLine();
        }

        int[][][] sales = new int[y][p][b];

        //----------sales-----------------
        for (int k = 0; k < y; k++) {
            System.out.println("=========" + year[k] + "========");
            for (int i = 0; i < p; i++) {
                System.out.println(product[i]);
                for (int j = 0; j < b; j++) {
                    System.out.println(branch[j] + " sales:");
                    sales[k][i][j] = sc.nextInt();
                }
            }
        }

        //---------Display---------------------
        System.out.println("\n=========SALES REPORT========");

        for (int k = 0; k < y; k++) {
            System.out.println("\nYear: " + year[k]);

            System.out.print("Product\t");
            for (int j = 0; j < b; j++) {
                System.out.print(branch[j] + "\t");
            }
            System.out.println();

            for (int i = 0; i < p; i++) {
                System.out.print(product[i] + "\t");
                for (int j = 0; j < b; j++) {
                    System.out.print(sales[k][i][j] + "\t");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
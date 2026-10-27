import java.util.Scanner;
class Node {
    int token;
    String name;
    Node next;
 Node(int token, String name) {
        this.token = token;
        this.name = name;
        this.next = null;
    }
}
public class BankQueue {
    Node front = null;
    Node rear = null;
    int Size = 0;
// ENQUEUE
    void enqueue(int token, String name) {
        Node newNode = new Node(token, name);
           if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }


        Size++;
    }


    // DEQUEUE
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }


        System.out.println("Serving: " + front.token + "-" + front.name);
        front = front.next;
        Size--;


        if (front == null) {
            rear = null;
        }
    }


    // PEEK
    void peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Next: " + front.token + "-" + front.name);
        }
    }


    // DISPLAY
    void display() {
        Node temp = front;


        if (temp == null) {
            System.out.println("Queue is Empty");
            return;
        }


        while (temp != null) {
            System.out.println(temp.token + "-" + temp.name);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankQueue q = new BankQueue();


        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the token:");
            int token = sc.nextInt();
            sc.nextLine();


            System.out.print("Enter Name: ");
            String name = sc.nextLine();


            q.enqueue(token, name);
        }


        System.out.println("\nCustomers:");
        q.display();


        q.peek();


        System.out.println("Size: " + q.Size);


        q.dequeue();


        System.out.println("\nAfter Dequeue:");
        q.display();


        System.out.println("Size: " + q.Size);


        sc.close();
    }
}
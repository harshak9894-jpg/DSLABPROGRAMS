import java.util.Scanner;

class stacklinkedlist{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Node head=null;
        Node temp=null;

        System.out.println("Enter number of nodes:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Enter the Data for Node"+i+":");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if(head==null){
                head=newNode;
                temp=newNode;
            }
            else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        System.out.println("\nhead Element:");
        System.out.println("Linked List elements:");

        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
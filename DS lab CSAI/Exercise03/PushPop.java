import java.util.Scanner;
class PushPop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //INPUT-Size of Stack
        System.out.println("Enter Stack Size:");
        int size=sc.nextInt();
        //sc.nl/
        //Initializing Stack size
        int stack[]=new int[size];
        int top=-1;
        
        System.out.println("How many Elements do you want to Push?");
        int n=sc.nextInt();

        //Push operation
        //Stack overflow
        if(n>size)
        {
            System.out.println("Stack Overflow! Cannot insert more");
            sc.close();
            return;
        }
        //INPUT Stack Elements
        else{
            System.out.println("\nEnter Stack Elements:");

            for(int i=0;i<n;i++)
            {
                System.out.print("Element"+(i+1)+":");
                int element =sc.nextInt();
                top++;
                stack[top]=element;
            }
            System.out.println("\nStack after Push Operation:");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
        //Pop Operation
        if(top==-1)
        {
            System.out.println("\nStack UnderFlow");
        }
        else{
            System.out.println("\nPopped Element:"+stack[top]);
            top--;
        }
        System.out.println("\nStack after Pop Operation:");
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
        sc.close();
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}


class Node{
    String data;
    Node left;
    Node right;

    Node(String data){
        this.data=data;
        left=null;
        right=null;
    }
}

class BinaryTree{
    static void printTree(Node root,String indent, boolean last){

        if(root ==null){
            return;
        }
        
        System.out.print(indent);
        
        if(last){
            System.out.print("|__");
            indent+="  ";
        }else{
            System.out.print("|--");
            indent+="| ";
        }

        System.out.println(root.data);

        printTree(root.left,"",false);
        printTree(root.right,"",true);

    }

    public static void main(String[]args){
        Node root=new Node("Principal");

        root.left=new Node("HOD - CS");
        root.right=new Node("HOD - AI");

        root.left.left=new Node("Faculty 1");
        root.left.right=new Node("Faculty 2");

        root.right.left=new Node("Faculty 3");
        root.right.right=new Node("Faculty 4");

        System.out.println("College Hierarchy:");
        System.out.println(root.data);
        printTree(root.left,"",false);
        printTree(root.right,"",true);
    }
}

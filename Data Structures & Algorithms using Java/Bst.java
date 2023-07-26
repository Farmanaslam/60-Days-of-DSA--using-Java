import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Bst{
static class Node{
    int data;
    Node left;
Node right;
Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
    
}
}


public static Node insertNode(Node root,int val){
    if(root==null){
        root=new Node(val);
        return root;
    }
    if(root.data>val){
        root.right=insertNode(root.right, val);
    }
    else{
        root.left=insertNode(root.left, val);
    }
    return root;
}

public static void inOrder(Node root){
    if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data);
    inOrder(root.right);
}

//Search in binary search tree..........
public static boolean search(Node root,int key){
    if(root==null){
        return false;
    }
    else if(root.data>key){
        return search(root.right, key);
    }
   if(root.data==key){
    return true;
   }
   else{
    return search(root.left, key);
   }}

    public static void main(String[] args) {
        
Node root=null;
int nodesvalue[]={8,7,2,5,6,3};
for(int i=0;i<nodesvalue.length;i++){
root=insertNode(root, nodesvalue[i]);
}
inOrder(root);
System.out.println(" \n\n");

if(search(root,1)){
    System.out.println("Found in BST.....");
}
else{
    System.out.println("Not  Found in BST.....");
}

    }
}
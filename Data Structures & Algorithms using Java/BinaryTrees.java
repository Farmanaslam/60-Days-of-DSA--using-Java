public class BinaryTrees {
public static class Node{

    //node properties .........
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public static class BinaryTree{
    
    
//creating nodes for tree function........
public static Node createNode(int data){
    Node newNode=new Node(data);
    newNode.left=null;
    newNode.right=null;
    return newNode;
}


//preorder traversal of a treee.......
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
 

    //inorder traversal of tree...
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


    //postorder traversal of tree 
public void postOrder(Node root){
    if(root==null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
}

//function to create tree with array elements
int index=-1;
public Node buildTree(int nodesoftree[]){
    index++;
    if(nodesoftree[index]==-1){
        return null;
    }
    Node newNode =new Node(nodesoftree[index]);
    newNode.left=buildTree(nodesoftree);
    newNode.right=buildTree(nodesoftree);
    return newNode;
}


}
    public static void main(String[] args) {
      BinaryTree tree=new BinaryTree();
      Node root=tree.createNode(1);
       root.left=tree.createNode(2);
       root.right=tree.createNode(3);
       root.left.left=tree.createNode(4);
       root.left.right=tree.createNode(5);
       root.right.left=null;
       root.right.right=tree.createNode(6);
       System.out.println("Preorder traversal of tree:");
       tree.preOrder(root);
       System.out.println();
       System.out.println("Inorder traversal of tree:");
       tree.inOrder(root);
       System.out.println();
       System.out.println("Postorder traversal of tree:");
       tree.postOrder(root);

       System.out.println();


//creating a tree with nodes data storecd in an array 
//if data=-1 then it is nullor leaf node
System.out.println("New tree ");
BinaryTree tree2=new BinaryTree();
int nodesoftree[]={11,22,44,-1,-1,55,-1,-1,33,-1,66,-1,-1};

Node root2=tree2.buildTree(nodesoftree);
tree2.preOrder(root2);
System.out.println();
tree2.inOrder(root2);
System.out.println();
tree2.postOrder(root2);
    }
    
}

import java.time.chrono.HijrahEra;
import java.util.*;
import java.util.LinkedList;
public class BinaryTreeQuestions {
    public static class Node{
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
 
    //Question1 Level order traversal
public void levelOrder(Node root){
Queue<Node> q=new LinkedList<>();
q.add(root); 
q.add(null);

while(!q.isEmpty()){
    Node currNode=q.remove();
    if(currNode==null){
        System.out.println();
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);
        }
    }else{
        System.out.print(currNode.data);
        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if(currNode.right!=null){
            q.add(currNode.right);
        }

    }
}
}

//Question 2.........Total nodes in a tree
public int countOfNodes(Node root){
    if(root==null){
        return 0;
    }
    
        int leftcount=countOfNodes(root.left);
    int rightcount=countOfNodes(root.right);
    
    
    return leftcount+rightcount+1;
}


//question 3 ..........sum of nodes of a tree
public int sumOfNodes(Node root){
if(root==null){
    return 0;
}
int sumofleft=sumOfNodes(root.left);
int sumofright=sumOfNodes(root.right);
return sumofleft+sumofright+root.data;

}



}

    }
    public static void main(String[] args) {
        BinaryTree trees= new BinaryTree();
        int nodesoftree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
Node root=trees.buildTree(nodesoftree);
trees.levelOrder(root);


int nodes=trees.countOfNodes(root);
System.out.println("Total Nodes are:"+nodes);    

int sum=trees.sumOfNodes(root);
System.out.println("Sum of all node of tree is:"+sum);


}
}

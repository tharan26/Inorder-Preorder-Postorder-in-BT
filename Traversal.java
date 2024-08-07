import java.util.*;

class TreeNode{
    int value;
    TreeNode left,right;

    public TreeNode(int value){
        this.value=value;
        left = right = null;
    }
}

public class Traversal{
    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void preorder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    
    public void postorder(TreeNode node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);


        Traversal tree = new Traversal();

        System.out.print("Inorder Traversal : ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Preorder Traversal : ");
        tree.preorder(root);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        tree.postorder(root);
        System.out.println();
    }
}
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};

    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val,TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }



}

public class kthSmallest {
    // Helper list to store inorder traversal result
    private static List<Integer> inorderResult;

    // Recursive helper for inorder traversal
    private static void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        inorderResult.add(node.val);
        inorder(node.right);
    }

    public static int findKthSmallest(TreeNode root, int k) {
        inorderResult = new ArrayList<>(); // Initialize for each call
        inorder(root);
        // k is 1-indexed, so we need k-1 for 0-indexed list
        return inorderResult.get(k - 1);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);

        int k=1;
        System.out.println(findKthSmallest(root, k));
    }
}
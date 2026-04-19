class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val) {
    this.val = val; }

}

public class PathSum {
    public static boolean Pathsum(TreeNode root ,int targetsum){
        if(root==null) return false;


        if(root.left==null && root.right==null){
            return targetsum == root.val;
        }

        return Pathsum(root.left, targetsum - root.val) || Pathsum(root.right, targetsum - root.val);
    }
}
class Main{
public static void main(String args[]){
    PathSum sol=new PathSum();

    TreeNode root=new TreeNode(5);
    root.left=new TreeNode(4);
    root.right=new TreeNode(8);
    root.left.left=new TreeNode(11);
    root.left.left.left=new TreeNode(7);
    root.left.left.right=new TreeNode(2);
    root.right.left=new TreeNode(13);
    root.right.right=new TreeNode(4);
    root.right.right.right=new TreeNode(1);

    int targetsum=22;
    System.out.println(sol.Pathsum(root, targetsum));
}
}
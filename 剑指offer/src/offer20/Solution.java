package offer20;
/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author wutong
 *
 */
public class Solution {
	public void Mirror(TreeNode root) {
		if(root!=null) {
			TreeNode tem=new TreeNode(0);
			tem=root.left;
			root.right=root.left;
			root.left=tem;
			if(root.left!=null)
				Mirror(root.left);
			if(root.right!=null)
				Mirror(root.right);
		}
	}
}
class TreeNode{
	int val=0;
	TreeNode left=null;
	TreeNode right=null;
	public TreeNode(int val) {
		this.val=val;
	}
}
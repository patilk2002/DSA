class Solution {
    static int max=0;
    public int longestZigZag(TreeNode root) {
        if(root==null) return -1;
        max=0;
        traverse(root.right,1,true);
        traverse(root.left,1,false);
        return max;
    }

    public void traverse(TreeNode root,int step,boolean right){
        if(root==null) return;

        max=Math.max(max,step);
        if(right){
            traverse(root.left,step+1,false);
            traverse(root.right,1,true);
        }  
        else{
            traverse(root.right,step+1,true);
            traverse(root.left,1,false);
        }
    }
}
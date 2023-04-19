
Approach 1:

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

Approach 2:

class Solution {
    public int longestZigZag(TreeNode root) {
        return dfs(root)[2];
    }

    private int[] dfs(TreeNode root){
        if(root==null) return new int[]{-1,-1,-1};

        int[] left = dfs(root.left), right = dfs(root.right);

        int res = Math.max(Math.max(left[1],right[0])+1,Math.max(left[2],right[2]));

        return new int[]{left[1]+1,right[0]+1,res};

    }
}
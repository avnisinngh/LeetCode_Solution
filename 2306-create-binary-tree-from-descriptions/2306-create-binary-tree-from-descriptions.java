/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] des) {
        HashMap<Integer,TreeNode>hm=new HashMap<>();
        for(int i=0;i<des.length;i++){
                TreeNode newnode=new TreeNode(0);
                TreeNode another=new TreeNode(0);
                if(!hm.containsKey(des[i][0])){
                   newnode=new TreeNode(des[i][0]);
                }
                else if(hm.containsKey(des[i][0])){
                    newnode=hm.get(des[i][0]);
                }
                if(!hm.containsKey(des[i][1])){
                    another=new TreeNode(des[i][1]);
                }
                else if(hm.containsKey(des[i][1])){
                    another=hm.get(des[i][1]);
                }
                if(des[i][2]==1){
                    newnode.left=another;
                }
                else{
                    newnode.right=another;
                }
                hm.put(des[i][0],newnode);
                hm.put(des[i][1],another);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<des.length;i++){
            set.add(des[i][1]);
        }
        for(int i:hm.keySet()){
            if(!set.contains(i)){
                return hm.get(i);
            }
        }
        return new TreeNode(-1);
    }
}
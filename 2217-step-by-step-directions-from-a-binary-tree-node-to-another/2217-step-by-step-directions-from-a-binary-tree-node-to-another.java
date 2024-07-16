class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root==null){
            return null;
        }
        if(root.val==p||root.val==q){
            return root;
        }
        TreeNode lca=lowestCommonAncestor(root.left,p,q);
        TreeNode rca=lowestCommonAncestor(root.right,p,q);
        if(lca!=null&&rca!=null){
            return root;
        }
        if(lca!=null){
            return lca;
        }else{
            return rca;
        }
    }
    public boolean solve(TreeNode root,int target,ArrayList<Character> str){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        str.add('L');
        if(solve(root.left,target,str)){
            return true;
        }
        str.remove(str.size()-1);
        str.add('R');
        if(solve(root.right,target,str)){
            return true;
        }
        str.remove(str.size()-1);
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode node=lowestCommonAncestor(root,startValue,destValue);
        ArrayList<Character> start=new ArrayList<>();
        ArrayList<Character> end=new ArrayList<>();
        solve(node,startValue,start);
        solve(node,destValue,end);
        String str="";
        for(int i=0;i<start.size();i++){
            str+='U';
        }
        for(int i=0;i<end.size();i++){
            str+=end.get(i);
        }
        return str;
    }
}
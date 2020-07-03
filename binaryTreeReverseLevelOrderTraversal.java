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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        List<TreeNode> list1 = new ArrayList();
        list1.add(root);
        List<TreeNode> list2 = new ArrayList();
        boolean a = true;
        while(list1.size() > 0 || list2.size() > 0){
            if(a){
                List<Integer> level = new ArrayList<>();
                for(int i =0; i < list1.size(); i++){
                    if(list1.get(i).left != null){
                        list2.add(list1.get(i).left);
                    }
                    if(list1.get(i).right != null){
                        list2.add(list1.get(i).right);
                    }
                    level.add(list1.get(i).val);
                }
                list.add(0, level);
                list1 = new ArrayList<>();
                a = false;
            } else {
                List<Integer> level = new ArrayList<>();
                for(int i =0; i < list2.size(); i++){
                    if(list2.get(i).left != null){
                        list1.add(list2.get(i).left);
                    }
                    if(list2.get(i).right != null){
                        list1.add(list2.get(i).right);
                    }
                    level.add(list2.get(i).val);
                }
                list.add(0, level);
                list2 = new ArrayList<>();
                a = true;
            }
        }
        return list;
    }
}

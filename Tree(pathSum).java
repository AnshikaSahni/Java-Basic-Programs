 //TO DISPLAY  IF THE TREE HAS A ROOT-TO-LEAF PATH SUCH THAT ADDING UP ALL THE VALUES ALONG THE  PATH EQUALS TARGETSUM.
class Solution {
      
    public boolean hasPathSum(TreeNode root, int targetSum) { 
         
        return pathsum(root,targetSum);
        
    }
   public boolean pathsum(TreeNode node,int targetSum)
   {  
     // CHECKING IF NODE IS NULL THEN IT IS NOT EQUAL TO TARGETSUM SO RETURN FALSE.
       if(node==null)
       {
           return false;
       }
     // IF THERE IS SINGLE NODE AND IT VALUE IS EQUAL TO TARGETSUM THEN RETURN TRUE.
       if(node.left==null&&node.right==null&&node.val==targetSum)
       {
           return true;
       }
      // OTHERWISE RECURSIVELY TRAVERSE THE LEFT AND RIGHT SUBTREES
        // RETURN TRUE IF ANY OF THE RECURSIVE CALLS RETURN TRUE
        // UPDATE THE NEW SUM TO TARGETSUM - ROOT.VAL.
      return  pathsum(node.left,targetSum-node.val)||pathsum(node.right,targetSum-node.val);
   }
}

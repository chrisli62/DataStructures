public List<Integer> inorderTraversal(TreeNode root) {
        //Time complexity: O(n)
        //Space complexity: O(n)
        List<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
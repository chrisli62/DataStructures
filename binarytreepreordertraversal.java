public List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null) {
                res.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return res;
    }
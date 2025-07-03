public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            root = stack.pop();
            res.add(0, root.val);
            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);
        }
        return res;
    }
//
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean isTreeSymmetric(Tree<Integer> t) {
    if(t == null)
        return true;
    return compare(t.left, t.right); 
}

boolean compare(Tree<Integer> root1, Tree<Integer> root2) {
    if(root1 == null && root2 == null) {
        return true;
    }
    else if(root1 == null || root2 == null) {
        return false;
    }
            
    return compare(root1.left, root2.right) && compare(root1.right, root2.left) && (root1.value.equals(root2.value));
}

String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();

    for (String s : path.split("/")) {
        if ("..".equals(s)) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else if (!s.isEmpty() && !".".equals(s)) {
            stack.push(s);
        }
    }

    return "/" + String.join("/", stack); 
}

char firstNotRepeatingCharacter(String s) {
    char[] c = s.toCharArray();
    for(int i = 0; i < s.length(); i++){
        if(s.indexOf(c[i]) == s.lastIndexOf(c[i]))
            return c[i];
    }
    return '_';
}
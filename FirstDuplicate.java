int firstDuplicate(int[] a) {
    //Initialize index
    int min = -1;
    
    HashSet<Integer> set = new HashSet<>();
    
    for(int i = 0; i <= a.length-1; i++) {
        if(set.contains(a[i])) {
            min = i;
            return a[min];
        }
        else
            set.add(a[i]);
    }
    return -1;
}
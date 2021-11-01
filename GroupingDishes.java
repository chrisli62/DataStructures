String[][] groupingDishes(String[][] dishes) {
    HashMap<String,ArrayList<String>> map = new HashMap<>();
    for(String[] ingred : dishes) {
        for(int i=1; i < ingred.length; i++) {
            if(map.containsKey(ingred[i])) {
                ArrayList<String> food = map.get(ingred[i]);
                food.add(ingred[0]);
                map.put(ingred[i],food);
            }
            else {
                ArrayList<String> food = new ArrayList<>();
                food.add(ingred[0]);
                map.put(ingred[i],food);
            }
        }
    }
    
    ArrayList<String[]> list = new ArrayList<>();
    for(String ingred : map.keySet()) {
        ArrayList<String> food = map.get(ingred);
        if(food.size() > 1) {
            Collections.sort(food);
            String[] fin = new String[food.size()+1];
            fin[0] = ingred;
            for(int i = 0; i < food.size(); i++) {
                fin[i+1] = food.get(i);
            }
            list.add(fin);
        }
    }
    
    Collections.sort(list, (a,b)->a[0].compareTo(b[0]));
    return list.toArray(new String[0][]);
}

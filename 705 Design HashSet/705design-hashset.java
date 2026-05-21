class MyHashSet {
ArrayList<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        if (set.contains(key)) return;
        set.add(key);
    }
    
    public void remove(int key) {
        int pos=-1;
        for(int i=0;i<set.size();i++){
            if (key==set.get(i)){
                pos=i; break;
            }
        }
        if(pos!=-1) set.remove(pos);
        else return;
    }
    
    public boolean contains(int key) {
        for(int i:set){
            if (i==key){
                return true;
            }
        }return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean = obj.contains(key);
 */
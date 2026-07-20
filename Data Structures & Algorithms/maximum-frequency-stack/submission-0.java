class FreqStack {

    Map<Integer, Integer> hm;
    Map<Integer, Stack<Integer>> grp;
    int maxFreq;

    public FreqStack() {
        hm = new HashMap<>();
        grp = new HashMap<>();
        maxFreq = 0;
    }
    
    public void push(int val) {
        int f = hm.getOrDefault(val, 0) + 1;
        hm.put(val, f);

        maxFreq = Math.max(maxFreq, f);
        grp.putIfAbsent(f,new Stack<>());
        grp.get(f).push(val);


    }
    
    public int pop() {
        int val = grp.get(maxFreq).pop();
        hm.put(val,hm.get(val) - 1);


        if(grp.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return val;

        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
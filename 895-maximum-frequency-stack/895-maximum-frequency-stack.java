class FreqStack {

    Map<Integer, Integer> freqMap;
	Map<Integer, Stack<Integer>> freqStack;
	int maxFreq;
	
    public FreqStack() {
        freqMap=new HashMap<Integer, Integer>();
        freqStack=new HashMap<Integer, Stack<Integer>>();
	    maxFreq=0;
    }
    
	public void push(int val) {
		int f=freqMap.getOrDefault(val,0)+1;
		freqMap.put(val,f);
		if(f>maxFreq)
			maxFreq=f;
		freqStack.computeIfAbsent(f,x->new Stack()).push(val);
	}
	
	public int pop() {
		int x=freqStack.get(maxFreq).pop();
		freqMap.put(x, freqMap.get(x)-1);
		if(freqStack.get(maxFreq).size()==0)
			maxFreq--;
		return x;
	}
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
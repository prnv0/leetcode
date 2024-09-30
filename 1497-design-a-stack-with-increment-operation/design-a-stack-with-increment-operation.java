class CustomStack {
    int top=-1;
    int n;
    int[] stack;
    public CustomStack(int maxSize) {
        stack= new int[maxSize];
        n=maxSize;
        System.out.println(n);
    }
    
    public void push(int x) {
        //System.out.println(top +" "+stack[top+1]);
        if(++top>=n){
            top--;
            return;
        }
        stack[top]=x;
        System.out.println(stack[top]);
    }
    
    public int pop() {
        if(top==-1)
            return -1;
        return stack[top--];
    }
    
    public void increment(int k, int val) {
        System.out.println("Min "+Math.min(k,top));
        for(int i=0;i<Math.min(k,top+1);i++)
            stack[i]=stack[i]+val;
        return;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
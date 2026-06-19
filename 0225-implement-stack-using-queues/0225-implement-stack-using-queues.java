class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        int size = q.size();
        for (int i=0; i<size-1; i++) {
            q.add(q.remove()); //rotating every push, popping all and putting at end
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
package ds.leetcode.basic.stack.impl;

public class StackImplUsingArray {

    public static class Stack<T> {
        private int idx = 0;
        private T[] stack;
        public Stack() {
            stack = (T[]) new Object[100];
        }
        public void push(T value) {
            stack[idx] = value;
            idx++;
        }
        public void display() {
            int n = 0;
            while (n < size()) {
                System.out.print(stack[n]+" ");
                n++;
            }
            System.out.println();
        }
        public int size() {
            return idx;
        }

        public T pop() {
            T top = stack[idx-1];
            stack[idx-1] = null;
            idx--;
            return top;
        }

        public T peek() {
            if(idx > 0) {
                return stack[idx-1];
            }
            throw new StackOverflowError("Index is zero");
        }

        public int capacity() {
            if (idx < 10)
                return 10-idx;
            return Integer.MIN_VALUE;
        }

        public boolean isFull(Stack<T> st) {
             if(idx < 100) {
                return false;
            }
             return true;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int size = st.size();
        st.display();
        System.out.println(size);
        int pop = st.pop();
        System.out.println(pop);
        System.out.println(st.size());
        Integer peek = st.peek();
        System.out.println(peek);
        st.display();
        int c = st.capacity();
        System.out.println(c);
        boolean isFull = st.isFull(st);

        System.out.println(isFull);
        st.push(20);
        st.display();

    }
}

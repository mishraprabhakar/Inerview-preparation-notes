package ds.leetcode.basic.stack.impl;

public class StackImplUsingLinkedList {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static class Stack {

        Node head = null;
        int size = 0;

        public void push(int i) {
            Node val = new Node(i);
            val.next = head;
            head = val;
            size++;
        }

        //Display should be in reverse
        public void display() {
            displayRec(head);
            System.out.println();

        }

        private void displayRec(Node h) {
            if (h == null) {
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        public int pop() {

            if (head == null) {
                System.out.println("Linked List is Empty. ");
                return Integer.MIN_VALUE;
            }

            int val = head.val;
            head = head.next;
            size--;
            return val;

        }

        public int peek() {

            if (head == null) {
                System.out.println("Linked List is Empty. ");
                return Integer.MIN_VALUE;
            }
            return head.val;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st.size);

        st.display();
        st.push(60);
        st.push(70);
        st.display();

        System.out.println(st.size);


        int value = st.pop();
        System.out.println("POP "+value);

        st.display();

        int top = st.peek();
        System.out.println("Peek "+top);

        st.push(80);
        st.push(90);
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.size);
        st.pop();
    }
}














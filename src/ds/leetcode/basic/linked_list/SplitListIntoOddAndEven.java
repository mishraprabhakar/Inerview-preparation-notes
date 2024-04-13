package ds.leetcode.basic.linked_list;

public class SplitListIntoOddAndEven {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(6);
        Node h = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;

        displayList(a);
        System.out.println();
        splitIntoOddAndEven(a);
    }

    private static void splitIntoOddAndEven(Node head) {

        Node h = head;

        Node odd = new Node(1);
        Node o = odd;
        Node even = new Node(1);
        Node e = even;

        while (h != null) {

            Node node = new Node(h.data);

            if (node.data % 2 == 0) {

                e.next = node;
                e = node;
            } else {
                o.next = node;
                o = node;
            }
            h = h.next;
        }

        System.out.println("Odd List");
        displayList(odd.next);

        System.out.println();
        System.out.println("Even List");
        displayList(even.next);
    }

    private static void displayList(Node head) {
        while (head != null) {
            System.out.print(head.data +" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}

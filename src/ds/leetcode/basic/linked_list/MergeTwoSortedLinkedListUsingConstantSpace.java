package ds.leetcode.basic.linked_list;

public class MergeTwoSortedLinkedListUsingConstantSpace {

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
        d.next = null;

        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;

        Node node = mergeTwoSortedLinkedListInConstantSpace(a, e);
        displayList(node);
    }

    private static Node mergeTwoSortedLinkedListInConstantSpace(Node head1, Node head2) {

        Node h1 = head1;
        Node h2 = head2;

        Node result = new Node(100);
        Node h = result;

        while (h1!=null && h2!=null) {

            if (h1.data < h2.data) {
                h.next = h1;
                h = h1;
                h1 = h1.next;
            } else {
                h.next = h2;
                h = h2;
                h2 = h2.next;
            }
        }

        if (h1 == null) {
            h.next = h2;
        } else {
            h.next = h1;
        }

        return result.next;
    }

    private static void displayList(Node head) {
        while (head != null) {
            System.out.print(head.data +" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}

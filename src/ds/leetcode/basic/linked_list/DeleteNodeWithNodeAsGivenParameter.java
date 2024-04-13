package ds.leetcode.basic.linked_list;

class DeleteNodeWithNodeAsGivenParameter {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        deleteNode(d);

        printLinkedList(a);

    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }

    private static void deleteNode(Node d) {
        d.data = d.next.data;
        d.next = d.next.next;
    }
}

package ds.leetcode.basic.linked_list;

public class DeleteMiddleElementOfLinkedList {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);

        a.next = null;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
//        f.next = null;

        deleteMiddleElement(a);
        displayList(a);

    }

    private static void deleteMiddleElement(Node head) {

        Node slow = head;
        Node fast = head;

        if (head.next == null) {
            return;
        }

        while (fast.next.next != null && fast.next.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
    }

    private static void displayList(Node head) {
        while (head != null) {
            System.out.print(head.data +" -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}

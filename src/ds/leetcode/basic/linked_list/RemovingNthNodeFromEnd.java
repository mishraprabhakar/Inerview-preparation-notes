package ds.leetcode.basic.linked_list;

public class RemovingNthNodeFromEnd {

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

        printLinkedList(a);
        a = deleteNodeFromEnd(a, 5);
        System.out.println();
        printLinkedList(a);

    }

    private static Node deleteNodeFromEnd(Node head, int index) {

        Node slow = head;
        Node fast = head;

        while (index != 0) {
            fast = fast.next;
            index--;
        }

        //when we have to delete head and avoid exception
        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next= slow.next.next;
        return head;
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }
}

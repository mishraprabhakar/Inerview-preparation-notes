package ds.leetcode.basic.linked_list;

public class FindMiddleElementOfLinkedListInOneTraverse {

    static class Node {
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

        Node middleNode = findMiddleElementInOneTraverse(a);
        System.out.println(middleNode.data);

    }

    private static Node findMiddleElementInOneTraverse(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }


}

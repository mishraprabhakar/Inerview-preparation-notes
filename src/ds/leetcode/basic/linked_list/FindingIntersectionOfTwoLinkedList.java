package ds.leetcode.basic.linked_list;

public class FindingIntersectionOfTwoLinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(1);
        Node c = new Node(8);
        Node d = new Node(4);
        Node e = new Node(5);

        Node g = new Node(5);
        Node h = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        g.next = h;
        h.next = b;

        printLinkedList(a);
        System.out.println();
        printLinkedList(g);
        System.out.println();

        Node intersectionNode = findIntersectionOfTwoGivenList(a, g);
        System.out.println(intersectionNode.data);


    }

    private static Node findIntersectionOfTwoGivenList(Node head1, Node head2) {

        int sizeOfList1 = findSizeOfLinkedList(head1);
        int sizeOfList2 = findSizeOfLinkedList(head2);

        int n = Math.abs(sizeOfList1 - sizeOfList2);

        Node temp1 = head1;
        Node temp2 = head2;

        if (sizeOfList1 > sizeOfList2) {
            while (n != 0) {
                temp1 = temp1.next;
                n--;
            }
        } else {
            while (n != 0) {
                temp2 = temp2.next;
                n--;
            }
        }

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;

    }

    private static int findSizeOfLinkedList(Node head) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }
}

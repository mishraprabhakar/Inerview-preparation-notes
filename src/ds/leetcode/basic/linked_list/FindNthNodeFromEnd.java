package ds.leetcode.basic.linked_list;

public class FindNthNodeFromEnd {

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

//        Node nThNodeFromLast = findNthNodeFromEnd(a, 3);
//        System.out.println(nThNodeFromLast.data);

        Node nThNodeFromLast = getNthElementFromEnd(a, 3);
        System.out.println(nThNodeFromLast.data);
    }


    //Solution In One Traversal using two pointers slow and fast

    private static Node getNthElementFromEnd(Node head, int index) {

        Node slow = head;
        Node fast = head;

        while (index != 0) {
            fast = fast.next;
            index--;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }

//Solution in two traversal
    private static Node findNthNodeFromEnd(Node a, int val) {
        int count = 0;

        Node og = a;

        while (og != null) {
            count++;
            og = og.next;
        }

        int indexFromFirst = 0;

        if (count > 0) {
            indexFromFirst = count - val + 1;
        }

        if (indexFromFirst > 0) {

            Node result = getNthNode(a, indexFromFirst);
            return result;
        }

        return null;
    }

    private static Node getNthNode(Node a, int indexFromFirst) {

        while (indexFromFirst != 1) {
            a = a.next;
            indexFromFirst--;
        }

        return a;
    }
}

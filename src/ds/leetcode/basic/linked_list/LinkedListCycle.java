package ds.leetcode.basic.linked_list;

public class LinkedListCycle {
    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = head.next;

        boolean isCycleExist = hasCycleExist(head);
        System.out.println(isCycleExist);
        Node node = detectFirstNode(head);
        deleteLoop(head);


        while (head != null) {
            System.out.print(head.value+"->");
            head = head.next;
        }

    }


    /**
     * @param head is the node
     * @return if there is any cycle formation present, it will simply return true else false
     */
    private static boolean hasCycleExist(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param head head
     * @return function returns meeting pointer of slow and fast pointers
     */
    private static Node returnMeet(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }


    /**
     * @param head - node
     * @return method returns exactly by which point loop formation is started
     */
    private static Node detectFirstNode(Node head) {

        Node start = head;
        Node meet = returnMeet(head);
        Node previous = null;

        while (start != meet) {
            start = start.next;
            previous = meet;
            meet = meet.next;

        }
        return start;

    }

    public static void deleteLoop(Node head) {

        Node start = head;
        Node meet = returnMeet(head);
        Node previous = null;

        while (start != meet) {
            start = start.next;
            previous = meet;
            meet = meet.next;

        }
        assert previous != null;
        previous.next = null;
    }
}
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}


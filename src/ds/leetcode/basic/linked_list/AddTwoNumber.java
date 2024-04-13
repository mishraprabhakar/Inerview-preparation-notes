package ds.leetcode.basic.linked_list;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class AddTwoNumber {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(9);
        head1.next.next.next = new ListNode(9);
        head1.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next.next.next = null;

        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);
        head2.next.next.next = new ListNode(9);
        head2.next.next.next.next = null;

        ListNode addition = addTwoNode(head1, head2);

        while (addition != null) {
            System.out.print(addition.value + " ->");
            addition = addition.next;
        }
    }

    private static ListNode addTwoNode(ListNode head1, ListNode head2) {

        ListNode result = new ListNode(0);
        ListNode tail = result;

        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {

            int digit1 = 0, digit2 = 0;

            if (head1 != null) {
                digit1 = head1.value;
                head1 = head1.next;
            }

            if (head2 != null) {
                digit2 = head2.value;
                head2 = head2.next;
            }

            int sum = digit1 + digit2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;
        }

        return result.next;
    }
}

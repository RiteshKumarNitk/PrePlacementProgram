class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class AddLinkedLists {

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            int sum = carry;
            
            if (list1 != null) {
                sum += list1.val;
                list1 = list1.next;
            }

            if (list2 != null) {
                sum += list2.val;
                list2 = list2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);
        System.out.println("First List: ");
        printList(list1);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        System.out.println("Second List");
        printList(list2);

        ListNode sumList = addTwoNumbers(list1, list2);
        System.out.println("Sum of two Lists: ");
        printList(sumList);
    }
}

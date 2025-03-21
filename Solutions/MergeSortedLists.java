package Solutions;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: If either list is empty, return the other list
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        // Recursive case: Merge the smaller node first
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSortedLists solution = new MergeSortedLists();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedHead = solution.mergeTwoLists(list1, list2);
        printList(mergedHead); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
    }
}

import java.util.Scanner;

public class Insertionsortlist {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode insertionSortList(ListNode head) {

        // Dummy node before the sorted list
        ListNode dummy = new ListNode(0);

        ListNode current = head;

        while (current != null) {

            // Save the next node
            ListNode next = current.next;

            // Start searching from the beginning
            ListNode prev = dummy;

            // Find the correct position
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current into correct position
            current.next = prev.next;
            prev.next = current;

            // Move to next unsorted node
            current = next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of linked list: ");
        int n = sc.nextInt();

        // Empty list
        ListNode head = null;
        ListNode tail = null;

        // Get elements from user
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                // First node
                head = newNode;
                tail = newNode;
            } else {
                // Add node at the end
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Print original list
        System.out.println("Original list:");

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        // Sort the linked list
        head = insertionSortList(head);

        // Print sorted list
        System.out.println("\nSorted list:");

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        sc.close();

    }
}

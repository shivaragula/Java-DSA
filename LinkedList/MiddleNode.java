package LinkedList;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n == 0) return;

            ListNode head = new ListNode(sc.nextInt());
            ListNode current = head;

            for (int i = 1; i < n; i++) {
                current.next = new ListNode(sc.nextInt());
                current = current.next;
            }

            MiddleNode sol = new MiddleNode();
            ListNode middle = sol.middleNode(head);

            System.out.println(middle.val);
        }
    }
}
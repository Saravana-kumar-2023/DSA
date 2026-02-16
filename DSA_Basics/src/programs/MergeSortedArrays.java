package programs;

import java.util.ArrayList;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of list1: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        ListNode list1 = buildList(sc, n);

        System.out.print("Enter size of list2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements:");
        ListNode list2 = buildList(sc, m);

        ListNode result = mergeTwoLists(list1, list2);
        ArrayList<Integer> list = new ArrayList<>();

        for (ListNode t = result; t != null; t = t.next) {
            list.add(t.val);
        }
        System.out.println("Merged list: "+list);
	}

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode tail = dummy;
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
			}
			else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		if(list1 != null)
			tail.next = list1;
		else
			tail.next = list2;
		
		return dummy.next;
	}

	private static ListNode buildList(Scanner sc, int n) {
		if(n==0)
			return null;
		ListNode head = new ListNode(sc.nextInt());
		ListNode temp = head;
		for(int i = 1;i<n;i++) {
			temp.next = new ListNode(sc.nextInt());
			temp = temp.next;
		}
		return head;
	}
}

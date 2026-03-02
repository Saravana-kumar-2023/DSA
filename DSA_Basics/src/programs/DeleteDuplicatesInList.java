package programs;

import java.util.ArrayList;
import java.util.Scanner;

/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/
public class DeleteDuplicatesInList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of list: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        ListNode head = buildList(sc, n);
        head = deleteDuplicates(head);
        ArrayList<Integer> list = new ArrayList<>();

        for (ListNode t = head; t != null; t = t.next) {
            list.add(t.val);
        }
        System.out.println("duplicates removed list: "+list);
	}
	private static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.val == current.next.val) {
				current.next = current.next.next;
			}
			else {
				current = current.next;
			}
		}
		return head;
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


import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;

			tail = newNode;
		}
	}

	public void display() {

		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public boolean hasCycle(Node head) {
		Set<Node> mp = new HashSet<>();
		while (head != null) {
			if (mp.contains(head)) {
				return true;
			}
			mp.add(head);
			head = head.next;
		}
		return false;
	}

	public static void main(String[] args) {

		SinglyLinkedList sList = new SinglyLinkedList();

//		sList.addNode(1);
//		sList.addNode(2);
//		sList.addNode(3);
//		sList.addNode(4);

		sList.display();

		System.out.println("HAS CYCLE : " + sList.hasCycle(null));
	}
}
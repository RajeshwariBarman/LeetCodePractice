
public class MyLinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public MyLinkedList() {

	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {

		int length = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			length++;
		}

		if (index > length)
			return -1;
		else {
			temp = head;
			int count = 0;
			while (count < index-1) {
				temp = temp.next;
				count++;
			}

		}
        System.out.println(temp.data);
		return temp.data;

	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {

		Node new_node = new Node(val);
		if (head == null)
			head = new_node;
		else {
			new_node.next = head;
			head = new_node;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {

		Node new_node = new Node(val);
		if (head == null)
			head = new_node;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		int length = 0;
		Node new_node = new Node(val);
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		if(index ==1)
			addAtHead(val);
		else if (index < length) {
			temp = head;
			int count = 0;
			while (count < index - 1) {
				temp = temp.next;
				count++;
			}
			new_node.next = temp.next;
			temp.next = new_node;
		} else if (index == length) {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new_node;
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		int length = 0;
		Node temp = head;
		Node prev = head;
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		if (index <= length) {
			if (index == 1)
				head = head.next;
			else if (index == length) {
				Node second_last = head;
				while (second_last.next.next != null)
					second_last = second_last.next;

				// Change next of second last
				second_last.next = null;
			} else {
				int count = 0;
				temp = head;
				while (count < index-1) {
					prev = temp;
					temp = temp.next;
					count++;
				}

				prev.next = temp.next;
			}

		}

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		MyLinkedList obj = new MyLinkedList();
//		int param_1 = obj.get(index);
//		obj.addAtHead(7);
//		obj.addAtHead(2);
//		obj.addAtHead(1);
//		obj.addAtIndex(3, 0);
//		obj.deleteAtIndex(2);
//		obj.addAtHead(6);
//		obj.addAtTail(4);
//		obj.get(4);
//		obj.addAtHead(4);
//		obj.addAtIndex(5, 0);
//		obj.addAtHead(6);
		
		obj.addAtHead(1);
		obj.addAtTail(3);
		obj.addAtIndex(1, 2);
		obj.get(1);
		obj.deleteAtIndex(1);
		obj.get(1);
//		obj.display();

	}

}

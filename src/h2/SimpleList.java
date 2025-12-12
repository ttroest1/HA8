package h2;

public class SimpleList {
	Node head;
	
	public SimpleList() {
		head=new Node(Integer.MIN_VALUE);
	}
	
	public Node getFirst() {
		return head.next;
	}
	
	public Node getLast() {
		if(head.next==null) {
			return null;
		}
		Node current = head.next;
		while(current.next!=null) {
			current = current.next;
		}
		return current;
	}
	
	public void append(int newValue) {
		Node newNode = new Node(newValue);
		Node last = getLast();
		if(last==null) {
			head.next = newNode;
		}else {
			last.next = newNode;
		}
	}
	
	public Node findFirst(int value) {
		Node current = head.next;
		while(current!=null) {
			if(current.value==value) {
				return current;
			}
			current=current.next;
		}
		return null;
	}
	
	public boolean insertAfter(int preValue, int newValue) {
		Node current = head.next;
		while(current!=null) {
			if(current.value==preValue) {
				Node newNode = new Node(newValue);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public boolean delete(int value) {
		Node current = head;
		while(current.next!=null) {
			if(current.next.value==value) {
				current.next=current.next.next;
				return true;
			}
			current=current.next;
		}
		return false;
	}
}

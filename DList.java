/* DList.java */
/* Created */


public class DList {
	private DListNode head;
	private DListNode tail;
	long size;
	
	public DList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public DListNode headGetter() {
		return head;
	}
	
	public DListNode tailGetter() {
		return tail;
	}
	
	public void headSetter(DListNode node) {
		head = node;
	}
	
	public void tailSetter(DListNode node) {
		tail = node;
	}
	
	public DListNode nth(int n) {
		if (n <= 0) {
			System.out.println("n is invalid!");
			return null;
		} else if (n > size) {
			System.out.println("n is out of index! Return tail.");
			return tailGetter();
		}
		
		DListNode pointer = headGetter();
		for (int i = 1; i < n; i++) {
			pointer = pointer.next;
		}
		
		return pointer;
	}

}

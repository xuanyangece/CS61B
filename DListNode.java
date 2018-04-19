/* DListNode.java */
/* Created */

// Fields should better set to be private.
public class DListNode {
	public int redIntensity;
	public int greenIntensity;
	public int blueIntensity;
	public int length;
	public DList list;
	
	public DListNode prev;
	public DListNode next;
	
	public DListNode(int redIntensity, int greenIntensity, int blueIntensity, int length, DList list) {
		if (list.size == 0) {
			list.headSetter(this);
			list.tailSetter(this);
		}
		
		this.redIntensity = redIntensity;
		this.greenIntensity = greenIntensity;
		this.blueIntensity = blueIntensity;
		this.length = length;
		prev = null;
		next = null;
		list.size++;
		this.list = list;
	}
	
	public void insertFront(DListNode newNode) {
		if (this.prev == null) {
			this.prev = newNode;
			newNode.next = this;
		} else {
			newNode.prev = this.prev;
			newNode.next = this;
			this.prev.next = newNode;
			this.prev = newNode;
		}
		
		if (this.list.headGetter() == this) {
			this.list.headSetter(newNode);
		}
	}
	
	public void insertAfter(DListNode newNode) {
		if (this.next == null) {
			this.next = newNode;
			newNode.prev = this;
		} else {
			newNode.next = this.next;
			newNode.prev = this;
			this.next.prev = newNode;
			this.next = newNode;
		}
		
		if (this.list.tailGetter() == this) {
			this.list.tailSetter(newNode);
		}
	}
	
	static public void remove(DListNode node) {
		if (node.prev == null) {
			node.next.prev = null;
			node.list.headSetter(node.next);
		} else if (node.next == null) {
			node.prev.next = null;
			node.list.tailSetter(node);
		} else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		node.list.size--;
	}

}

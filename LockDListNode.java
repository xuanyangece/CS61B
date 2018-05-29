/* LockDListNode.java */

package list;

/**
 * A LockDListNode has an "isLocked" field to indicate whether it's locked.
 * When a new node is created, it should be unlocked.
 * 
 * @author SwaggyXUAN
 *
 */
public class LockDListNode extends DListNode {

	/**
	 * public Object item;
     * protected DListNode prev;
     * protected DListNode next;
	 */
	protected boolean isLocked;
	
	LockDListNode(Object i, DListNode p, DListNode n) {
		super(i, p, n);
		isLocked = false;
	}
	
	void lockSetter(boolean set) {
		isLocked = set;
	}
	
	boolean lockGetter() {
		return isLocked;
	}

}

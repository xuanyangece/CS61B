/* LockDList.java */

package list;

/**
 * LockDList should override method newNode to ensure every node is LockDListNode.
 * Once have done that, every operation is based on a LockDListNode, so we don't
 * have to override other methods like insertAfter.
 * And of course the remove method should be overridden, too.
 * 
 * @author SwaggyXUAN
 *
 */
public class LockDList extends DList {
	
	/**
	 *  protected DListNode head;
     *  protected int size;
	 **/
	
	LockDList() {
		super();
		
	}
	
	public void lockNode(DListNode node) {
		LockDListNode lockNode = (LockDListNode)node;
		lockNode.lockSetter(true);
	}

	protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
		return new LockDListNode(item, prev, next);
	}
	
	public void remove(DListNode node) {
		if (node == null || ((LockDListNode)node).lockGetter() == true) {
			return;
		} else {
		    node.prevGetter().nextSetter(node.nextGetter());
		    node.nextGetter().prevSetter(node.prevGetter());
		    size--;
		}
	}
}

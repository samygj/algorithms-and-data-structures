package leetcode;

import java.util.ArrayList;

public class NextRightPointer {
	ArrayList<TreeLinkNode> last = new ArrayList<TreeLinkNode>();
    
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        doConnect(root, 0);
    }
    
    public void doConnect(TreeLinkNode n, int i) {
        if (n == null || n.val == 0) return;
        if (n.val == Math.pow(2,i+1)-1)
            n.next = null;
        if (last.get(i) == null)
            last.add(n);
        else {
            last.get(i).next = n;
            last.set(i,n);
        }
        doConnect(n.left, i+1);
        doConnect(n.right, i+1);
    }
}

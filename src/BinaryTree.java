class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
    public void insert(int val) {
        if (val < this.val) {
            if (left == null) {
                left = new BinaryTreeNode(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new BinaryTreeNode(val);
            } else {
                right.insert(val);
            }
        }
    }
    public BinaryTreeNode remove(int val) {
        if (val < this.val) {
            if (left == null) {
                return null;
            } else {
                left = left.remove(val);
            }
        } else if (val > this.val) {
            if (right == null) {
                return null;
            } else {
                right = right.remove(val);
            }
        } else {
            if (left == null && right == null) {
                return null;
            }
            else if (left == null) {
                return right;
            } else if (right == null) {
                return left;
            }
            else {
                BinaryTreeNode minRight = right.findMin();
                val = minRight.val;
                right = right.remove(val);
            }
        }
        return this;
    }
    public BinaryTreeNode findMin() {
        if (left == null) {
            return this;
        }
        return left.findMin();
    }
}


public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.insert(2);
        root.insert(3);
        root.insert(4);
        root.insert(5);
        root.insert(7);
        root.insert(8);
        root.insert(9);
        root.insert(10);

        System.out.println("До изменения:");
        printTree(root);

        root = root.remove(5);
        System.out.println("После изменения:");
        printTree(root);
    }
    public static void printTree(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }
    }



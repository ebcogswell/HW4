
/**
 *
 * @author ix6638ym
 */
public class BinarySearchTree<E extends Comparable<E>> {

    private TreeNode<E> root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<E> root) {
        this.root = root;
    }

    public void insertNode(E value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value, root);
        }
    }

    public void inorderTraverse() {
        inorderHelper(root);
    }

    public void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftChild());
        System.out.print(node.getElement() + " ");
        inorderHelper(node.getRightChild());
    }

    public void preorderTraverse() {
        preorderHelper(root);
    }

    public void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getElement() + " ");
        preorderHelper(node.getLeftChild());
        preorderHelper(node.getRightChild());
    }

    public void postorderTraverse() {
        postorderHelper(root);
    }

    public void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftChild());
        postorderHelper(node.getRightChild());
        System.out.print(node.getElement() + " ");

    }

    public TreeNode treeSearch(TreeNode<E> node, E key) {
        return treeSearchHelper(root, key);
    }

    public TreeNode treeSearchHelper(TreeNode<E> node, E key) {
        try {
            if (key.compareTo(node.getElement()) < 0) {
                //further search on the left subtree
                return treeSearchHelper(node.getLeftChild(), key);
            } else if (key.compareTo(node.getElement()) > 0) {
                //further search on the right subtree
                return treeSearchHelper(node.getRightChild(), key);
            } else {
                return node;
            }
        } catch (Exception e) {
            return null;
        }
    }
}

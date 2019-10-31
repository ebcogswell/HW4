/**
 *
 * @author ix6638ym
 */
public class TreeNode<E extends Comparable<E> > {
    
    //data members
    private E element;
    private TreeNode<E> parent;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;
    
    //constructor
    public TreeNode(E element) {
        this.element = element;
        //this.parent = null;
        //this.leftChild = null;
        //this.rightChild = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public TreeNode<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }
    
    public void insert( E value, TreeNode<E> node ){
        //if value < root
            if(value.compareTo( node.getElement() ) < 0) {
                //go to left subtree
                if(leftChild == null) {
                    leftChild = new TreeNode( value );
                    leftChild.setParent(node);
                    node.setLeftChild(leftChild);
                }
                else {
                    //call insert recursively on the leftChild
                    leftChild.insert(value, leftChild);
                }
            }
            else{
                //go to right subtree
                if(rightChild == null) {
                    rightChild = new TreeNode( value );
                    rightChild.setParent(node);
                    node.setRightChild(rightChild);
                }
                else {
                    rightChild.insert(value, rightChild);
                }
            }    
    }
}

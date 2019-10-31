/**
 *
 * @author ix6638ym
 */
public class BinarySearchTreeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
        
        myTree.insertNode(29);
        myTree.insertNode(18);
        myTree.insertNode(5);
        myTree.insertNode(34);
        myTree.insertNode(31);
        myTree.insertNode(60);
        myTree.insertNode(75);
        myTree.insertNode(66);
        myTree.insertNode(24);
        myTree.insertNode(50);
        
        System.out.println("Inorder: ");
        myTree.inorderTraverse();
        
        System.out.println("\nPreorder: ");
        myTree.preorderTraverse();
        
        System.out.println("\nPostorder: ");
        myTree.postorderTraverse();
        
        TreeNode temp = myTree.treeSearch(myTree.getRoot(), 75);
        
        if(temp == null) {
            System.out.println("\n\nNot Found");
        }
        else {
            System.out.println("\n\nFound");
            //print its parent and child
            if(temp.getParent() != null) {
                System.out.println("Parent: " + temp.getParent().getElement());
            }
            
            if(temp.getLeftChild() != null) {
                System.out.println("Left Child: " + temp.getLeftChild().getElement());
            }
            
            if(temp.getRightChild() != null) {
                System.out.println("Right Child: " + temp.getRightChild().getElement());
            }
        }
    }
    
}

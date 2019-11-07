/**
 *
 * @author ix6638ym
 */
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class BinarySearchTreeClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        BinarySearchTree<String> myTree = new BinarySearchTree<String>();
        
      /*  myTree.insertNode(29);
        myTree.insertNode(18);
        myTree.insertNode(5);
        myTree.insertNode(34);
        myTree.insertNode(31);
        myTree.insertNode(60);
        myTree.insertNode(75);
        myTree.insertNode(66);
        myTree.insertNode(24);
        myTree.insertNode(50); */
         // pass the path to the file as a parameter 
    File file = new File("C:\\temp\\chatdictionary.txt"); 
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
          
        System.out.println("Inorder: ");
        myTree.inorderTraverse();
        
        System.out.println("\nPreorder: ");
        myTree.preorderTraverse();
        
        System.out.println("\nPostorder: ");
        myTree.postorderTraverse();
        
        TreeNode temp = myTree.treeSearch(myTree.getRoot(), ".exe");
        
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

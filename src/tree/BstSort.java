
package tree;

public class BstSort <T extends Comparable> {
    
    private Node root;
    
    public BstSort() {}
    
    public void insert (T obj) {
        if (root == null){
            root = new Node (obj);
        }
        else {
            Node node = root;
            
            while (true) {
                if (obj.compareTo(node.data) < 1) {
                    if (node.left == null) {
                        node.left = new Node (obj);
                        break;
                    }
                    node = node.left;
                }
                else {
                    if (node.right == null) {
                        node.right = new Node (obj);
                        break;
                    }
                    node = node.right;
                }
            }
        }
    }
    
    public void sort (){
        //inorder traversal in binary search tree will give the result in sorter order
        inorder (root);
    }
    
    private void inorder (Node node){
        
        if (node != null) {
            inorder (node.left);
            System.out.println (node.data);
            inorder (node.right);
        }
    }
    
    private class Node {
        public Node left;
        public Node right;
        public T data;
        
        public Node (){}
        public Node (T data){
            this.data = data;
        }
    }
    
    public static void main (String args[]) {
        BstSort<Integer> bst = new BstSort<>();
        
        bst.insert (125);
        bst.insert (15);
        bst.insert (51);
        bst.insert (55);
        bst.insert (45);
        
        bst.sort();
    }
    
}

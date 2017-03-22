/**
 * Created by niclasmolby on 22/03/2017.
 */
public class DictBinTree implements Dict {

    private Node root;
    private int size;
    private int pointer;

    public DictBinTree() {

    }

    public void insert(int k) {

    }

    public int[] orderedTraversal() {
        int[] orderedArray = new int[size];


        return new int[0];
    }

    private void inOrderTreeWalk(Node n){
        if(n != null) {
            inOrderTreeWalk(n.getLeftChild());
            System.out.println(n.getKey());
            inOrderTreeWalk(n.getRightChild());
        }
    }

    public boolean search(int k) {
        Node current = root;
        while(current != null && current.getKey() != k) {
            if (k < current.getKey()) {
                current = current.getLeftChild();
            }
            else {
                current = current.getRightChild();
            }
        }

        if(current.getKey() == k) {
            return true;
        }

        return false;
    }
}

/**
 * Created by niclasmolby on 22/03/2017.
 */
public class DictBinTree implements Dict {

    private Node root;
    private int size;
    private int pointer;
    private int[] orderedArray;

    public DictBinTree() {

    }

    public void insert(int k) {

    }

    public int[] orderedTraversal() {
        orderedArray = new int[size];
        pointer = 0;
        inOrderTreeWalk(root);

        return orderedArray;
    }

    private void inOrderTreeWalk(Node n){
        if(n != null) {
            inOrderTreeWalk(n.getLeftChild());
            orderedArray[0] = n.getKey();
            pointer++;
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

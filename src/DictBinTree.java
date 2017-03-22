/**
 * Created by niclasmolby on 22/03/2017.
 */
public class DictBinTree implements Dict {

    private Node root = null;
    private int size = 0;
    private int pointer;
    private int[] orderedArray;

    public DictBinTree() {

    }

    public void insert(int k) {
        Node currentNode = null;
        Node rootNode = root;
        Node newNode = new Node();
        newNode.setKey(k);
        newNode.setLeftChild(null);
        newNode.setRightChild(null);

        while(rootNode != null){
            currentNode = rootNode;
            if(newNode.getKey() < rootNode.getKey()) {
                rootNode = rootNode.getLeftChild();
            }
            else {
                rootNode = rootNode.getRightChild();
            }
        }
        if(currentNode == null) {
            root = newNode;
        }
        else if(newNode.getKey() < currentNode.getKey()) {
            currentNode.setLeftChild(newNode);
        }
        else {
            currentNode.setRightChild(newNode);
        }

        size++;
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
            orderedArray[pointer] = n.getKey();
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

        if(current != null && current.getKey() == k) {
            return true;
        }

        return false;
    }
}

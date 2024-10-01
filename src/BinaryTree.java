import java.util.Comparator;
import java.util.ArrayList;

public class BinaryTree<T> {
    
    private Node<T> root= null;
    private Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator){
        this.comparator=comparator;

    }

    public void add(T value){
        Node<T> newNode = new Node<T>(value);
        if (root==null) {
            root = newNode;
        }else{
            Node<T> found=searchNode(value);
            if (comparator.compare(value, found.getInfo())>0) {
                found.setHigher(newNode);   
            }else{
                found.setLower(newNode);
            }
        }
    }

    private Node<T> searchNode(T value){
        Node<T> aux=root;
        boolean found=false;
        while (found==false) {
            if (comparator.compare(value, aux.getInfo())>0 && aux.getHigher()!=null) {
                aux=aux.getHigher();
            }else{
                if (comparator.compare(value, aux.getInfo())<=0 && aux.getLower()!=null) {
                    aux=aux.getLower();
                }else{
                    return aux;
                }
            }
        }
        return aux;
    }

    public ArrayList<Node<T>> showOrder(){
        ArrayList<Node<T>> list = new ArrayList<Node<T>>();
        recursive(root, list);
        return list;

    }

    private void recursive(Node<T> aux, ArrayList<Node<T>> list){
        if (aux.getHigher()!=null) {
            recursive(aux.getHigher(), list);   
        }
        list.add(aux);
        if (aux.getLower()!=null) {
            recursive(aux.getLower(), list);
        }
    }
}

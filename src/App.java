

public class App {
    public static void main(String[] args) throws Exception {
        // BinaryTree<Integer> tree = new BinaryTree<Integer>(ComparatorNode.comparatorInt);
        // tree.add(30);
        // tree.add(50);
        // tree.add(35);
        // tree.add(38);
        // tree.add(20);
        // tree.add(13);
        // tree.add(5);
        // tree.add(21);
        // tree.add(7);
        // for (Node<Integer> node : tree.showOrder()) {
        //     System.out.println(node.getInfo());
        // }
        FIleRandomPerson file = new FIleRandomPerson();
        Person person = new Person();
        person.name = "Carlos";
        person.age = 20;
        person.ciudad = "Cali";
        file.write(person,0);
        Person person2 = new Person();
        person2.name = "Mafe";
        person2.age = 22;
        person2.ciudad = "Sogamoso";
        file.write(person2,100);
        file.read(0);
        file.read(100);
    }
}

public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> arbol = new BinarySearchTree<>();

        arbol.add(8);

        arbol.add(4);
        arbol.add(arbol.getRoot(), 10);
        arbol.add(arbol.getRoot(), 12);
        arbol.add(1);

        System.out.println(arbol);


    }

}

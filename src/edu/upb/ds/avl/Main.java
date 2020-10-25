package edu.upb.ds.avl;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n############################");
        System.out.println("\nBienvenido al arbol AVL");
        System.out.println("\n############################");
        AVLTree tree = new AVLTree();

        tree.root = tree.insertar(tree.root, 60);
        tree.root = tree.insertar(tree.root, 57);
        tree.root = tree.insertar(tree.root, 76);
        tree.root = tree.insertar(tree.root, 48);
        tree.root = tree.insertar(tree.root, 59);
        tree.root = tree.insertar(tree.root, 33);
        tree.root = tree.insertar(tree.root, 55);
        tree.root = tree.insertar(tree.root, 65);
        tree.root = tree.insertar(tree.root, 83);
        tree.root = tree.insertar(tree.root, 63);


        /*
        tree.root = tree.insertar(tree.root, 10);
        tree.root = tree.insertar(tree.root, 20);
        tree.root = tree.insertar(tree.root, 30);
        tree.root = tree.insertar(tree.root, 40);
        tree.root = tree.insertar(tree.root, 50);
        tree.root = tree.insertar(tree.root, 25);

         */
        System.out.println("\n############################");
        System.out.println("\nAVL en Orden Transversal : ");
        System.out.println("\n############################");
        tree.preOrden(tree.root);
    }
}

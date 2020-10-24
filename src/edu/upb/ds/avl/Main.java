package edu.upb.ds.avl;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n############################");
        System.out.println("\nBienvenido al arbol AVL");
        System.out.println("\n############################");
        AVLTree tree = new AVLTree();
        tree.root = tree.insertar(tree.root, 10);
        tree.root = tree.insertar(tree.root, 20);
        tree.root = tree.insertar(tree.root, 30);
        tree.root = tree.insertar(tree.root, 40);
        tree.root = tree.insertar(tree.root, 50);
        tree.root = tree.insertar(tree.root, 25);
        System.out.println("\n############################");
        System.out.println("\nAVL en Orden Transversal : ");
        System.out.println("\n############################");
        tree.preOrden(tree.root);
    }
}

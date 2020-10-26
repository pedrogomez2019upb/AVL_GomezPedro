package edu.upb.ds.avl;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n############################");
        System.out.println("\nBienvenido al arbol AVL");
        System.out.println("\n############################");

        AVLTree arbol = new AVLTree();
        //Ejercicio Clase
        arbol.root = arbol.insertar(arbol.root, 48);
        arbol.root = arbol.insertar(arbol.root, 65);
        arbol.root = arbol.insertar(arbol.root, 33);
        arbol.root = arbol.insertar(arbol.root, 76);
        arbol.root = arbol.insertar(arbol.root, 55);
        arbol.root = arbol.insertar(arbol.root, 60);
        arbol.root = arbol.insertar(arbol.root, 57);
        arbol.root = arbol.insertar(arbol.root, 63);
        arbol.root = arbol.insertar(arbol.root, 83);
        arbol.root = arbol.insertar(arbol.root, 59);
        arbol.root = arbol.insertar(arbol.root, 15);
        arbol.root = arbol.insertar(arbol.root, 56);
        arbol.root = arbol.insertar(arbol.root, 58);
        arbol.root = arbol.insertar(arbol.root, 37);
        arbol.root = arbol.insertar(arbol.root, 52);
        arbol.root = arbol.insertar(arbol.root, 1);
        arbol.root = arbol.insertar(arbol.root, 50);

        System.out.println("\n############################");
        System.out.println("\nAVL en Orden Transversal : ");
        System.out.println("\n############################");
        arbol.preOrden(arbol.root);
    }
}
//Developed by Pedro Gómez - ID:000396221
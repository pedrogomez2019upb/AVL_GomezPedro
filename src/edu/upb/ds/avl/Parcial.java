package edu.upb.ds.avl;

public class Parcial {
    public static void main(String[] args) {
        System.out.println("\n############################");
        System.out.println("\nBienvenido al arbol AVL (Parcial)");
        System.out.println("\n############################");

        AVLTree arbol = new AVLTree();
        //Ejercicio Parcial
        arbol.root = arbol.insertar(arbol.root, 200);
        arbol.root = arbol.insertar(arbol.root, 58);
        arbol.root = arbol.insertar(arbol.root, 142);
        arbol.root = arbol.insertar(arbol.root, 96);
        arbol.root = arbol.insertar(arbol.root, 88);
        arbol.root = arbol.insertar(arbol.root, 202);
        arbol.root = arbol.insertar(arbol.root, 44);
        arbol.root = arbol.insertar(arbol.root, 92);
        arbol.root = arbol.insertar(arbol.root, 74);
        arbol.root = arbol.insertar(arbol.root, 40);
        arbol.root = arbol.insertar(arbol.root, 50);
        arbol.root = arbol.insertar(arbol.root, 20);
        System.out.println("\n############################");
        System.out.println("\nAVL en Orden Transversal : ");
        System.out.println("\n############################");
        arbol.preOrden(arbol.root);
        System.out.println("\n############################");
        System.out.println("\nSe encuentra el elemento 74? ");
        System.out.println(arbol.encontrarElemento(74, arbol.root));
        System.out.println("\n############################");
        System.out.println("\nSe encuentra el elemento 25678? ");
        System.out.println(arbol.encontrarElemento(25678, arbol.root));
        System.out.println("\n############################");
        System.out.println("\nSe encuentra el elemento 96? ");
        System.out.println(arbol.encontrarElemento(96, arbol.root));
        System.out.println("\n############################");
        System.out.println("\nEliminar elementos 88 y 44 ");
        arbol.root = arbol.eliminarElemento(arbol.root, 88);
        arbol.root = arbol.eliminarElemento(arbol.root, 44);
        System.out.println("\n############################");
        System.out.println("\nAVL en Orden Transversal sin los ");
        System.out.println("\nnumeros 88 y 44:");
        System.out.println("\n############################");
        arbol.preOrden(arbol.root);
    }
}
//Desarrollado por Pedro Gómez - ID:000396221
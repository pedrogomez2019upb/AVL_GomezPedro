package edu.upb.ds.avl;

public class AVLTree {

    public Node root;

    public void preOrden(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrden(root.left);
        preOrden(root.right);
    }

    public void inOrden(Node root) {
        if(root == null) {
            return;
        }
        inOrden(root.left);
        System.out.print(root.data + " ");
        inOrden(root.right);
    }

    public void posOrden(Node root) {
        if(root == null) {
            return;
        }
        posOrden(root.left);
        posOrden(root.right);
        System.out.print(root.data + " ");
    }

    public int getBalance(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        return alturaArbol(nodo.left) - alturaArbol(nodo.right);
    }

    public int alturaArbol(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.height;
    }

    public int numeroMayor(int a, int b) {
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public Node rotarDerecha(Node nodo) {
        Node nodoIzquierdo = nodo.left;
        Node nodoIDerecho = nodoIzquierdo.right;
        nodoIzquierdo.right = nodo;
        nodo.left = nodoIDerecho;
        nodo.height = numeroMayor(alturaArbol(nodo.left), alturaArbol(nodo.right)) + 1;
        nodoIzquierdo.height = numeroMayor(alturaArbol(nodoIzquierdo.left), alturaArbol(nodoIzquierdo.right)) + 1;
        return nodoIzquierdo;
    }

    public Node rotarIzquierda(Node nodo) {
        Node nodoDerecho = nodo.right;
        Node nodoDIzquierdo = nodoDerecho.left;
        nodoDerecho.left = nodo;
        nodo.right = nodoDIzquierdo;
        nodo.height = numeroMayor(alturaArbol(nodo.left),alturaArbol(nodo.right)) + 1;
        nodoDerecho.height = numeroMayor(alturaArbol(nodoDerecho.left),alturaArbol(nodoDerecho.right)) + 1;
        return nodoDerecho;
    }

    public Node insertar(Node nodo, int dato) {
        if (nodo == null){
            return (new Node(dato));
        }

        else{

        if (dato < (int) nodo.data)
        {
            nodo.left = insertar(nodo.left, dato);
        }
        else if (dato > (int) nodo.data){
            nodo.right = insertar(nodo.right, dato);
        }
        else{
            return nodo;
            }
        }

        nodo.height = 1 + numeroMayor(alturaArbol(nodo.left), alturaArbol(nodo.right));

        //Obtener balance para saber si lo estaá
        int balance = getBalance(nodo);

        //4 casos de cuando el árbol no esta balanceado
        if (balance > 1 && dato < (int) nodo.left.data) {
            return rotarDerecha(nodo);
        }

        // DERECHA , DERECHA
        if (balance < -1 && dato > (int) nodo.right.data) {
            return rotarIzquierda(nodo);
        }

        // IZQUIERDA,DERECHA
        if (balance > 1 && dato > (int) nodo.left.data) {
            nodo.left = rotarIzquierda(nodo.left);
            return rotarDerecha(nodo);
        }

        // DERECHA,IZQUIERDA
        if (balance < -1 && dato < (int) nodo.right.data) {
            nodo.right = rotarDerecha(nodo.right);
            return rotarIzquierda(nodo);
        }
        return nodo;
    }
}
//Developed by Pedro Gómez - ID:000396221
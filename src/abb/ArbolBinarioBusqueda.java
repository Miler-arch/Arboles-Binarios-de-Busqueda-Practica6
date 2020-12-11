package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda (){
        raiz = null;
    }
    /*
    Arbol esta vacio o no
     */
    public boolean estaVacio(){
        return raiz == null;
    }
    /*
    Metodo recursivo para insertar un nodo a nuestro abb
     */
    private void insertar(Nodo padre, Nodo hijo, int dato){
        if(hijo == null){//caso base
            Nodo nuevo = new Nodo(null,dato,null);
            if(dato >= padre.getDato()){
                padre.setDerecho(nuevo);
            }else {
                padre.setIzquierdo(nuevo);
            }

        }else{//llamada recursiva
            if(dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecho(),dato);
            }else {
                insertar(hijo, hijo.getIzquierdo(),dato);
            }
        }
    }
    /*
    METODO AUXILIAR PARA INSERTAR UN NUEVO NODO AL ABB
     */
    public void insertar(int dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null,dato,null);
            raiz = nuevo;
        }else {
            if (dato >= raiz.getDato()){
                insertar(raiz, raiz.getDerecho(),dato);
            }else {
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }
    /*
    metodo recursivo para recorrer/mostrar el arbol inOrden
     */
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null){//caso base

        }else {//llamda recursiva
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    /*
    metodo auxiliar para recorrer/mostrar el arbol inOrden
     */
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
    private void mostrarPreOrden(Nodo nodo){
        if (nodo == null) {//caso base

        }else{
            System.out.print(nodo.getDato() + " ");
            mostrarPreOrden(nodo.getIzquierdo());
            mostrarPreOrden(nodo.getDerecho());
            }
    }
    public void mostrarPreOrden(){
        Nodo temp = raiz;
        mostrarPreOrden(raiz);
        System.out.println();
    }
    private void mostrarPostOrden(Nodo nodo){
        if (nodo == null) {//caso base

        }else{
            mostrarPostOrden(nodo.getIzquierdo());
            mostrarPostOrden(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
        }
    }
    public void mostrarPostOrden(){
        Nodo temp = raiz;
        mostrarPostOrden(raiz);
        System.out.println();
    }




}

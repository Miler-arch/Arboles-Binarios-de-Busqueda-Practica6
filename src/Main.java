import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        //insertar elementos
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);
        //recorremos/mostramos los elementos del arbol inOrden
        abb.mostrarInOrden();
        //insertar elementos
        abb.insertar(8);
        abb.insertar(25);
        abb.insertar(42);
        abb.insertar(2);
        abb.mostrarInOrden();

        //elementos PreOrden
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(5);
        abb.insertar(9);
        abb.mostrarPreOrden();

        //elementos PostOrden
        abb.insertar(7);
        abb.insertar(9);
        abb.insertar(11);
        abb.insertar(13);
        abb.mostrarPostOrden();
    }
}

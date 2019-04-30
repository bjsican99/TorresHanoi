package hanoi;


public class Pila3 {
    Nodo Primero;
    Nodo Siguiente;
    public Pila3(){
        Primero=null;
    }
    public boolean vacia(){
        if(Primero == null){
            return true;
        }else{
            return false;
        }
    }
    public void Apilar(int dato){
        Nodo nodo = new Nodo(dato);
        nodo.Siguiente = Primero;
        Primero = nodo;
    }
    public void Desapilar(){
        if(Primero != null){
            Nodo Eliminar = Primero;
            Primero = Primero.Siguiente;
            Eliminar.Siguiente = null;
        }
    }
}

package hanoi;

public class Nodo {
    int info;
    public int dato;
    public Nodo Siguiente;
    public Nodo (int dato){
        info = dato;
    }
    public void verNodo(){
        System.out.println("( "+info+" )");
    }
}

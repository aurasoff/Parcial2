package Punto3;

import java.util.Objects;

public class Cola<T> {
    private int size;
    private NodeSimple<T> firstNode; 
    private NodeSimple<T> lastNode; 


    public Cola(){
        this.size = 0;
        firstNode = null;
        lastNode = null;
        
    }
    public int getSize(){return size;}
    private boolean isEmpty() {return  firstNode == null;
    }
    public void encolar(T data){
        NodeSimple<T> newNodeSimple = new NodeSimple(data);
        if (isEmpty()){
            firstNode = newNodeSimple;
            lastNode = newNodeSimple;
        }else{
            lastNode.setNext(newNodeSimple);
            lastNode = newNodeSimple;
        }
        size++;
    }

    public T desencolar(){
        if(isEmpty()){
            throw new RuntimeException("La cola esta vacia");
        }else{
            T data = firstNode.getData();
            firstNode = firstNode.getNext();
            size--;
            return data;

        }
    }
    public void invertirColaRecursivo() {
        if (isEmpty()){
            return ;
        }
        T elemento = desencolar();
        invertirColaRecursivo();
        encolar(elemento);
       
    }
    public Cola<T> clonar() {
    Cola<T> copia = new Cola<>();
    NodeSimple<T> actual = firstNode;

    while (actual != null) {
        copia.encolar(actual.getData());  
        actual = actual.getNext();   
    }
    return copia;
    }


    public boolean sonIdenticas(Cola<T> otra) {
        if (otra == null || this.size != otra.size) {
            return false;            
        }

    NodeSimple<T> a = this.firstNode;
    NodeSimple<T> b = otra.firstNode;

        while (a != null) {
         if (!Objects.equals(a.getData(), b.getData())) {
            return false;                  
           
        }
        a = a.getNext();
        b = b.getNext();
        }
        return true;                   
    }
    public int size() {return size;}

    

}

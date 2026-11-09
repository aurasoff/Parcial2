package Punto1;


public class Pila<T> {
    private Node<T> top;
    private int size;

    
    public void Pila(){
        this.size = 0;
        this.top = null;
    }
    public boolean isEmpty(){
        return top == null ;

    }
    public void push(T data){
        Node newNodeSimple = new Node<T>(data);
        if(isEmpty()){
            top = newNodeSimple;
        }else{
            newNodeSimple.setNext(top);
            top = newNodeSimple;
        }
        size++;
    }
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("La pila esta vacia");
        }else {
            T data = top.getData();
            top = top.getNext();
            size--;
            return data;
        }
    }
    public T peek(){
        return top.getData();
    }
    public void print(){
        Node<T> aux = top;
        while(aux != null){
            System.out.println("Elemento : " + aux.getData()+"\t");
            aux = aux.getNext();
        }
    }
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

}

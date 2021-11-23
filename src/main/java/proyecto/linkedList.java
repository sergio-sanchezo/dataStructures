package proyecto;

import java.util.Comparator;

/*NOTA IMPORTANTE: Codigo tomado de: Guide to Data Structures - A Concise Introduction Using Java, 
Autores: James T. Streib,Takako Soma.
Tomado con fines academicos y practicos.*/
public class linkedList<T extends Comparable<T>> {
    
    private class Node<T>{
        private T data;
        private Node<T> next;
        public Node() {
            this(null);
        }
        public Node(T data) {
            this.data = data;
            next = null;
        }
    }
   
    private int N = 0;
    private Node<T> head,tail;
    public linkedList() {
        head = null;
        tail = null;
    }
    public int sizeLinkedList() {
        return N;
    }
    public void pushBack(T item) {

        Node<T> ptr;
        Node<T> auxt;
        ptr = head;
        Node<T> newp = new Node(item);
        
        if (tail == null){
            head = newp;
            tail = newp;
        }else{
            tail.next = newp;
            tail = newp;
            N = N +1;
        }
    }
    public boolean insertByPrice(T item) {
        //long startTime = System.nanoTime();
        boolean inserted;
        Node<T> ptr;
        Node<T> prev;
        inserted = false;
        ptr = head;
        prev = null;
        while(ptr != null && ptr.data.compareTo(item) < 0){
            prev = ptr;
            ptr = ptr.next;
        }
        if(ptr == null || (ptr.data.compareTo(item) != 0 )) {
            inserted = true;
            Node<T>newp = new Node();
            newp.data = item;
            newp.next = ptr;
            if(prev == null)
                head = newp;
            else
                prev.next = newp;
        }
        N = N +1;
        //long endTime = System.nanoTime();
        //System.out.println("El tiempo de ejecución fue de:"+(endTime-startTime)+" ns");
        return inserted;
    }
    public void popBack() {
        Node<T> ptr;
        Node<T> auxNext;
        ptr = head;
        auxNext = null;
        if(head == null){
            System.out.print("Error: Lista Vacia.");
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            while(ptr.next.next != null){
                ptr = ptr.next;
            }
            ptr.next = auxNext;
            tail = ptr;
        }
        N = N -1;
    }
    public void removeFirstByMemory(int memory){
        long startTime = System.nanoTime();
        Node<T> ptr,prev;
        ptr = head;
        prev = null;
        boolean removed = false;
        Tarjeta_Madre item = new Tarjeta_Madre("","","",memory,0,"",0,0);
        while(ptr != null && removed == false){
            if(ptr.data.equals(item)){
                if(prev == null){
                    head = ptr.next;
                    ptr.next = null;
                }
                else{
                    prev.next = ptr.next;
                    ptr.next = null;
                }
                removed = true;
                N = N -1;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        long endTime = System.nanoTime();
        System.out.println("El tiempo de ejecución fue de:"+(endTime-startTime)+" ns");
    }
    public void FindAllByMemory(int memory){
        Node<T> ptr;
        ptr = head;
        Tarjeta_Madre item = new Tarjeta_Madre("","","",memory,0,"",0,0);
        while(ptr != null){
            if(ptr.data.equals(item)){
                System.out.println(ptr.data.toString()+" ");
            }
            ptr = ptr.next;
        }
    }

    public void printRecursive() {
        System.out.println("List Recursive: ");
        printR(head);
        System.out.println();
    }
    private void printR(Node p){
        if(p != null) {
            System.out.println(p.data.toString()+" ");
            printR(p.next);
        }
    }
}

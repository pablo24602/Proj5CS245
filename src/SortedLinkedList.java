import com.sun.jdi.ArrayType;
import java.util.*;
public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    public static class Node<T> {
        public T data;
        private Node<T> next;



        public Node(T value) {
            data = value;
            next = null;
        }

        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node head = null;
    private int size = 0;
    private T[] link;


    @Override
    public boolean add(T j){
        size++;


        Node curr = head;

        if(size==1)
        {
            add(0,j);
            return true;
        }


        int pos = 0;
        for (int i = 0; i < size-1; i++) {

            if ((((T)curr.getData()).compareTo(j))>0)
            {
                pos = i;
                add(i, j);
                return true;
            }
            curr = curr.next;
        }
        add(size, j);

        return true;



        //return (T) curr.getData();
    }

    @Override
    public int size()
    {
        return size;
    }

    public void add (int pos, T item)
    {
        if (pos == 0)
        {Node node = new Node(item);
        node.next = head;
        head = node;

        }
        else {
            Node prev = head;

        for (int i=0; i < pos-1; i++)
            prev = prev.next;
            Node node = new Node(item);
            node.setNext(prev.next);
            prev.setNext(node);
            }}

        @Override
        public T remove (int pos) {
        --size;
        if (pos == 0)
        {
            Node node = head;
            head = head.next;
            return (T) node.getData();
        }
        else {
            Node prev = head;
            for (int i=0; i < pos-1; i++)
                prev = prev.next;
            Node node = prev.next;
            prev.setNext(node.getNext());
            return (T)node.getData();
        }
        }

            @Override
            public T get (int pos) {
                Node curr = head;
                for (int i = 0; i < pos; i++)
                    curr = curr.next;
                return (T) curr.getData();
            }
        }


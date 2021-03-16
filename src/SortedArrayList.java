import com.sun.jdi.ArrayType;
import java.util.*;
public class SortedArrayList<T extends Comparable<T>> implements SortedList<T> {

    private int size  = 0;
    private T[] a;


    @Override
    public boolean add(T value) {
        T [] a_copy = (T[]) new Comparable[size+1];
        T temp = null;
        T temp2 = null;
        boolean done = false;
        for (int j = 0; j<size; j++)
        {
            if(done==true)
            {
                temp2 = a[j];
                a_copy[j] = temp;
                temp = temp2;
            }
            else if ((a[j].compareTo(value))>0) {
                done = true;
                temp = a[j];
                a_copy[j] = value;
            }
            else {
                a_copy[j]=a[j];
            }
        }
        size++;

        if (done && size>1)
        {
            a_copy[size-1] = a[size-2];
        }
        else
        {
            a_copy[size-1] = value;
        }
        a = a_copy;
        return true;
        }


    @Override
    public int size() {
        return size;
    }

    @Override
    public T remove(int pos) {
        size--;
        T thingToReturn = a[pos];
        T [] a_copy = (T[]) new Comparable[size];
        for (int x = 0; x<size; x++)
        {
            if (x<pos)
            {
                a_copy[x]=a[x];
            }
            else {
                a_copy[x] = a[x + 1];
            }
        }
        a = a_copy;
        return thingToReturn;
    }

    @Override
    public T get(int pos)
    {
        if (pos<0)
        {
            throw new EmptyStackException();
        }
        if(pos>size-1)
        {
            throw new EmptyStackException();
        }
        return a[pos];
    }
}
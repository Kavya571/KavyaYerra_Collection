package com.epam.task;
import java.util.Arrays;

public class CustomLists<A> 
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object obj[];
    public CustomLists() {
        obj = new Object[DEFAULT_CAPACITY];
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder strb = new StringBuilder();
         strb.append('{');
         for(int i = 0; i < size ;i++) {
             strb.append(obj[i].toString());
             if(i<size-1){
                 strb.append(",");
             }
         }
         strb.append('}');
         return strb.toString();
    }
     
    private void checkCapacity() {
        int newSize = obj.length * 2;
        obj = Arrays.copyOf(obj, newSize);
    }
	public A get(int string) {
		if (string >= size || string < 0) {
            throw new IndexOutOfBoundsException("Index: " + string + ", Size " + string);
        }
        return (A) obj[string];
	}
	public A remove(int i) {
			 if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object x = obj[i];
	        int numobj = obj.length - ( i + 1 ) ;
	        System.arraycopy(obj, i + 1, obj, i, numobj ) ;
	        size--;
	        return (A) x;
	    }
	public void add(A i) {
			if (size == obj.length) {
            checkCapacity();
        }
        obj[size++] = i;	
	}
}

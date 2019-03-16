package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E extends Object> extends GenericStack<E>{
    private Object[] elements;


    public ObjectStack() {
        elements = (Object[]) new Object[0];
    }


    public void push(Object object) {
        elements = Arrays.copyOf(elements, elements.length + 1);

        elements[elements.length - 1] = object;


    }

    public boolean isEmpty() {
        boolean flag=false;
        if(elements.length!=0)
            flag = false;
        else
            flag=true;

        return flag;

    }

    public E pop() {
        Object temp = elements[elements.length-1];

        elements = Arrays.copyOf(elements, elements.length-1);
        return (E)temp;
    }

}

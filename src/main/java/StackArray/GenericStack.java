package StackArray;



import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */

/*
 Implement Stack<E> to use an array as a stack. You'll need to potentially grow the array in the push method. Do this first with
 an E[] array, and then again with an Object[] array. Both should compile without warnings and pass the tests.
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }


    public void push(E object) {
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
        E temp = elements[elements.length-1];

        elements = Arrays.copyOf(elements, elements.length-1);
            return temp;
    }

}
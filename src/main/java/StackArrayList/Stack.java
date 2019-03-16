package StackArrayList;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        elements = new ArrayList<E>();

    }

    public void push(E nextElement)
    {
        elements.add(nextElement);

    }
    public boolean isEmpty() {
        boolean flag = false;
        if(elements.size()==0)
            flag=true;
        else
            flag = false;
        return flag;
    }

    public E pop()
    {
            if(elements.size()!=0){

            return elements.remove(elements.size()-1);
        }   else
                return (E) elements.remove(0);
    }



}

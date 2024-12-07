package genericClassesAndMethods20.genericClasses;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> elements;

    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10);
    }

    // constructor creates a stack of the specified number of elements
    public Stack( int capacity ) {
        int initCapacity = (capacity > 0) ? capacity : 10;
        this.elements = new ArrayList<T>(initCapacity);
    }

    // push elements onto stack, antes del void no ponemos <T>, esto solo lo hacemos en clases estaticas, ya que las clases estaticas son clases que se pueden llasmar desde cualquier parte dependiendo de su tipo dealcance
    public void push(T pushValue) {
        this.elements.add(pushValue);
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop() {
        if( this.elements.isEmpty() )
            throw new EmptyStackException("Stack is empty, cannot pop");

        return this.elements.remove(this.elements.size()-1);
    }

}

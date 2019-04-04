package de.thro.inf.prg3.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {

    Element head;

    // SimpleList Methoden
    @Override
    public void add(Object o) {
        Element element = new Element();
        element.item = o;
        element.next = null;

        if (head == null)
        {
            head = element;
        }
        else
        {
            Element pointer;
            pointer = head;
            while (pointer.next != null)
            {
                pointer = pointer.next;
            }
            pointer.next = element;
        }
    }

    @Override
    public int size()
    {
        Element pointer = head;
        if (pointer == null)
        {
            return 0;
        }

        int amount = 1;

        while (pointer.next != null)
        {
            pointer = pointer.next;
            amount++;
        }
        return amount;

    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        // neue Liste anlegen

        return null;
    }

    // Iterable Methoden
    @Override
    public java.util.Iterator iterator() {
        return null;
    }


    private static class Element {
        Object item;
        Element next;
    }

    private class SimpleIteratorImpl implements Iterator {

        Element element = head;

        @Override
        public boolean hasNext()
        {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}

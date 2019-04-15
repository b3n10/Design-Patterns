package com.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter implements Iterator {
    Enumeration enumeration;

    public EnumeratorAdapter(Enumeration _enumeration) {
        enumeration = _enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

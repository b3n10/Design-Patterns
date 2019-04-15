package com.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter  implements Enumeration {
    Iterator iterator;

    public IteratorAdapter(Iterator _iterator) {
        iterator = _iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}

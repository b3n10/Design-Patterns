package com.enumerationiterator;

import java.util.*;

public class EnumerationAdapterTest {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new Hashtable<>();
        stringMap.put("one", 1);
        stringMap.put("two", 2);

        Enumeration enumeration = ((Hashtable<String, Integer>) stringMap).elements();
        Iterator iterator = new EnumeratorAdapter(enumeration);

        testIterator(iterator);

        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("Hi");

        Iterator _iterator = arrayList.iterator();
        Enumeration _enumeration = new IteratorAdapter(_iterator);

        testEnumeration(_enumeration);
    }

    public static void testIterator(Iterator iterator) {
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        try {
            iterator.remove();
        } catch (UnsupportedOperationException ex) {
            ex.printStackTrace();
        }
    }

    public static void testEnumeration(Enumeration enumeration) {
        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());
    }
}

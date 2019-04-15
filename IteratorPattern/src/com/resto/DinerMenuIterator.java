package com.resto;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] _menuItems) {
       menuItems =  _menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.length && menuItems[position] != null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}

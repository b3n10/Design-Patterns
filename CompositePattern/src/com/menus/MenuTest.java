package com.menus;

public class MenuTest {
    public static void main(String[] args) {
        MenuComponent allMenus = new Menu("ALL MENUS", "Top-level menu");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Menu for dinner");
        MenuComponent desertMenu = new Menu("Desert Menu", "Menu for desert");

        desertMenu.add(new MenuItem("Rocky Road", "rocky ice cream", 5.5, false));
        dinerMenu.add(new MenuItem("Rice", "NFA", 10.2, false));
        dinerMenu.add(new MenuItem("Etlog", "delicious eggs from dubai", 21.4, true));
        dinerMenu.add(desertMenu);

        allMenus.add(dinerMenu);
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}

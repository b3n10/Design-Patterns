package com.didispizza;

public class PitzaStoreTest {
    public static void main(String[] args) {
        PitzaStore pitzaStore = new PampangaPitzaStore();
        Pitza pitza = pitzaStore.orderPitza("hawaiian");
        System.out.println("Ethan ordered " + pitza.getName());

        pitzaStore = new BulacanPitzaStore();
        pitza = pitzaStore.orderPitza("cheese");
        System.out.println("Ben ordered " + pitza.getName());
    }
}

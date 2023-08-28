package Exercicio1;

import java.util.Collection;

public class App{
    public static void main(String[] args) {
        CollectionFactory factory = CollectionFactory.getInstance();

        Collection<Integer> arraylist = factory.createCollection(20,true,false);
        System.out.println(arraylist.getClass().getName());

        Collection<Integer> treeset = factory.createCollection(0,true,false);
        System.out.println(treeset.getClass().getName());

        Collection<Integer> linkedlist = factory.createCollection(0,true,true);
        System.out.println(linkedlist.getClass().getName());

        Collection<Integer> hashset = factory.createCollection(0,false,false);
        System.out.println(hashset.getClass().getName());
    }
}
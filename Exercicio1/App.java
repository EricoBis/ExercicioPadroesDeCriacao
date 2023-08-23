package Exercicio1;

import java.util.Collection;

public class App{
    public static void main(String[] args) {
        CollectionFactory CF = new CollectionFactory<>();

        Collection<Integer> c = CF.criaInstancia(20,true,false);
        c.add(10);
        c.add(30);
        c.add(50);
        System.out.println(c.getClass().getName());
        c.forEach(System.out::println);

        Collection<Integer> d = CF.criaInstancia(0,true,false);
        System.out.println(d.getClass().getName());

        Collection<Integer> f = CF.criaInstancia(0,true,true);
        System.out.println(f.getClass().getName());

        Collection<Integer> g = CF.criaInstancia(0,false,false);
        System.out.println(g.getClass().getName());
    }
}
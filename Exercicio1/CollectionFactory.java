package Exercicio1;

import java.util.*;

public class CollectionFactory<T> {

    private static CollectionFactory factory = null;

    private CollectionFactory() {
    }

    public static CollectionFactory getInstance() {
        if (factory == null)
            factory = new CollectionFactory();

        return factory;
    }

    public <T> Collection<T> createCollection(int size, boolean sorted, boolean canRepeat) {
        if (size > 0)
            return new ArrayList<T>(size);

        if (sorted == true) {
            if (canRepeat == true)
                return new LinkedList<T>();
            else
                return new TreeSet<T>();
        }
        return new HashSet<T>();
    }
}

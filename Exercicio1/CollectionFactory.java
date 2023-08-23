package Exercicio1;

import java.util.*;

public class CollectionFactory<T> {
    
    public Collection<T> criaInstancia(int tam, boolean ehOrdenado, boolean podeRepetir){
        if(tam > 0){
            return new ArrayList<>(tam);
        }
        if(ehOrdenado == true) {
            if (podeRepetir == true) {
                return new LinkedList<>();
            } else {
                return new TreeSet<>();
            }
        }
        return new HashSet<>();
    }
}

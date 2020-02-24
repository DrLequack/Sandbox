package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main (String ...args ){
        String []  words = new String[] {"one", "two", "three"};
        List<String> listWords = new ArrayList<>();
        toCollection(words,listWords);
        System.out.println(listWords);
    }

    static <T> void toCollection (T[] a, Collection<T> c){
        for(T o : a){
            c.add(o);
        }
    }
}

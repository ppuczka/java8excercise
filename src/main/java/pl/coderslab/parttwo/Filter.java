package pl.coderslab.parttwo;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);


}

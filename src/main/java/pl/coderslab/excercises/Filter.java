package pl.coderslab.excercises;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);
}

package pl.coderslab;
@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);

}

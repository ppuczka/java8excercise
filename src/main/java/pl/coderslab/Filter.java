package pl.coderslab;


@FunctionalInterface
public interface Filter<T> {

    boolean check(T v);

}

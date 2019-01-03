package pl.coderslab.homework;

@FunctionalInterface
public interface Check<T> {

    boolean check(T t);
}

package pl.coderslab.parttwo;

@FunctionalInterface
public interface Transform<T, S> {

    T change(S s );
}

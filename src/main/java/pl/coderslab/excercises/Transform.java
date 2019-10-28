package pl.coderslab.excercises;

@FunctionalInterface
public interface Transform<T, S> {

	T transform(S s);
}
package pl.coderslab.homework.b_Dzien_2;

@FunctionalInterface
public interface MyPredictate<T, S> {

    boolean test(T t, S s);
}

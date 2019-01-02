package pl.coderslab;


@FunctionalInterface
public interface Transform<T, S>{

    T change(S s);
    

}

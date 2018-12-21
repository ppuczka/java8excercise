package pl.coderslab;


public abstract class NumberFilter<V extends Number> implements Filter {

    public boolean check(Integer v) {
        return v < 20;

    }
}

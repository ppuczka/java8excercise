package pl.coderslab;


public class NumberFilter implements Filter<Integer> {

    @Override
    public boolean check(Integer v) {
        return v < 20;
    }
}

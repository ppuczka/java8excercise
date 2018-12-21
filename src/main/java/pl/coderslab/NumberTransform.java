package pl.coderslab;

public class NumberTransform implements Transform<Integer, Integer> {


    @Override
    public Integer change(Integer s) {
        return s-1;
    }
}

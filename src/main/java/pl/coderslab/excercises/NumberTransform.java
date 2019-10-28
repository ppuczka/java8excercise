package pl.coderslab.excercises;

public class NumberTransform implements Transform<Integer, Integer> {

    @Override
    public Integer transform(Integer i) {
        return i-1;
    }
}

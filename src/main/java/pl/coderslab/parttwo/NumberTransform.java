package pl.coderslab.parttwo;

public class NumberTransform implements Transform<Integer, Integer> {

    @Override
    public Integer change(Integer integer) {
        return integer - 5;
    }
}

package pl.coderslab.parttwo;

public class StringFilter implements CheckIfString {

    @Override
    public boolean check(Object s) {
        return s instanceof String;
    }
}

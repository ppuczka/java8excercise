package pl.coderslab.homework;

public class CheckNumber implements Check<Integer> {

    @Override
    public boolean check(Integer integer) {
        return integer >= 0 && integer <= 100;
    }

    public static void main(String[] args) {


        CheckNumber checkNumber = new CheckNumber();
        Integer first = 0;
        System.out.println(checkNumber.check(first));


    }

}

package pl.coderslab.parttwo;

public class Main5 implements SquareRoot {
    @Override
    public Double count(Double number, Double power) {

        return Math.pow(number, power);
    }

    public static void main(String[] args) {
        Double number = 2.00;
        Double power = 2.00;
        Double number2 = 9.00;


        SquareRoot squareRoot = (number1, power1) -> Math.pow(number1, power1);

    }
    }


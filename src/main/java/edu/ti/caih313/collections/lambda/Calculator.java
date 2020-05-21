package edu.ti.caih313.collections.lambda;

public class Calculator {
    public static void main(String... args) {

        Calculator myApp = new Calculator();

        //Demo for Integer addition, subtraction, multiplication, and division
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a / b;


        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));
        System.out.println("20 * 3 = " +
                myApp.operateBinary(20, 3, multiplication));
        System.out.println("100 / 5 = " +
                myApp.operateBinary(100, 5, division));

        //Demo for Double addition, subtraction, multiplication, and division
        DoubleMath doubleAddition = (a, b) -> a + b;
        DoubleMath doubleSubtraction = (a, b) -> a - b;
        DoubleMath doubleMultiplication = (a, b) -> a * b;
        DoubleMath doubleDivision = (a, b) -> a / b;

        System.out.println("40.3 + 23.2 = " +
                myApp.operateBinary(40.3, 23.2, doubleAddition));
        System.out.println("32.3 - 2.5 = " +
                myApp.operateBinary(32.3, 2.5, doubleSubtraction));
        System.out.println("2.3 * 3.2 = " +
                myApp.operateBinary(2.3, 3.2, doubleMultiplication));
        System.out.println("42.6 / 2.2 = " +
                myApp.operateBinary(42.6, 2.2, doubleDivision));

        //Demo for Unary absolute value and inverse
        UnaryMath absoluteValue = (a) -> ((a >= 0) ? a : -a);
        UnaryMath inverse = (a) -> 1 / a;

        System.out.println("|-3| = " +
                myApp.operateBinary(-3, absoluteValue));
        System.out.println("|3| = " +
                myApp.operateBinary(3, absoluteValue));
        System.out.println("|0| = " +
                myApp.operateBinary(0, absoluteValue));
        System.out.println("Inverse of 4 = " +
                myApp.operateBinary(4, inverse));
        System.out.println("Inverse of 1/4 = " +
                myApp.operateBinary(.25, inverse));
    }

    private int operateBinary(int a, int b, IntegerMath integerMath) {
        return integerMath.operation(a, b);
    }

    private double operateBinary(double a, double b, DoubleMath doubleMath) {return doubleMath.operation(a, b); }

    private double operateBinary(double a, UnaryMath unaryMath) {return unaryMath.operation(a); }
}

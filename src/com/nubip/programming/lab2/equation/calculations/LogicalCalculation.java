package com.nubip.programming.lab2.equation.calculations;

import com.nubip.programming.lab2.equation.equations.DoubleEquation;

public class LogicalCalculation implements Calculation{

    private final DoubleEquation doubleEquation;

    public LogicalCalculation(DoubleEquation doubleEquation) {
        this.doubleEquation = doubleEquation;
    }

    @Override
    public double calculateY(double x) {
        if (x > -5 && x < 0) {
            return doubleEquation.calculateFirstExpression(x);
        }
        else if (x < -12 || x > 25 && x <= 44) {
            return doubleEquation.calculateSecondExpression(x);
        }
        else {
            throw new ArithmeticException();
        }
    }

}

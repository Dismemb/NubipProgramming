package com.nubip.programming.lab2.equation.equations;

public class DoubleEquationImpl implements DoubleEquation{
    @Override
    public double calculateFirstExpression(double x) {
        return Math.pow(x, 4) - Math.pow(x, 2) + 25;
    }

    @Override
    public double calculateSecondExpression(double x) {
        return -56 + 25 * x;
    }
}

package com.nubip.programming.lab2.equation.equations;

import com.nubip.programming.lab2.equation.constants.Constants;

public interface DoubleEquation extends Equation{
    default String getType() {
        return Constants.DOUBLE_EQUATION_TYPE;
    }

    double calculateFirstExpression(double x);

    double calculateSecondExpression(double x);
}

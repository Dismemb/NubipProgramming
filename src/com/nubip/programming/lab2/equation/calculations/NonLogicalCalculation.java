package com.nubip.programming.lab2.equation.calculations;

import com.nubip.programming.lab2.equation.constants.Constants;
import com.nubip.programming.lab2.equation.equations.DoubleEquation;

public class NonLogicalCalculation implements Calculation {

    private final DoubleEquation doubleEquation;

    public NonLogicalCalculation(DoubleEquation doubleEquation) {
        this.doubleEquation = doubleEquation;
    }

    @Override
    public double calculateY(double x) {
        if (x > -5) {
            if (x < 0) {
                return doubleEquation.calculateFirstExpression(x);
            }
        }
        if (x >= 5) {
            if (x <= 25) {
                return doubleEquation.calculateFirstExpression(x);
            }
        }
        if (x < -12) {
            return doubleEquation.calculateSecondExpression(x);
        }
        if (x > 25) {
            if (x <= 44) {
                return doubleEquation.calculateSecondExpression(x);
            }
        }

        throw new ArithmeticException(Constants.WRONG_ARGUMENT_DESC);
    }
}

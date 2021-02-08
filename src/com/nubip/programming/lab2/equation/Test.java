package com.nubip.programming.lab2.equation;

import com.nubip.programming.lab2.equation.calculations.Calculation;
import com.nubip.programming.lab2.equation.calculations.LogicalCalculation;
import com.nubip.programming.lab2.equation.calculations.NonLogicalCalculation;
import com.nubip.programming.lab2.equation.equations.DoubleEquation;
import com.nubip.programming.lab2.equation.equations.DoubleEquationImpl;

public class Test {
    public static void main(String[] args) {
        DoubleEquation doubleEquation = new DoubleEquationImpl();

        Calculation logical = new LogicalCalculation(doubleEquation);
        Calculation nonLogical = new NonLogicalCalculation(doubleEquation);

        System.out.println(logical.calculateY(-1.5) == nonLogical.calculateY(-1.5));
    }
}

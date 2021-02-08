package com.nubip.programming.lab2.university.system;

import com.nubip.programming.lab2.university.constants.Constants;

public class GradeCheckerImpl implements GradeChecker{
    @Override
    public String getGradeRank(int grade) {
        if (grade < 0 || grade > 100) {
            throw new ArithmeticException(Constants.WRONG_ARGUMENT_DESC);
        }

        if (grade < 60) {
            return Constants.UNSATISFACTORY;
        }
        else if (grade < 75) {
            return Constants.SATISFACTORY;
        }
        else if (grade < 90) {
            return Constants.OK;
        }
        else {
            return Constants.PERFECTLY;
        }
    }
}

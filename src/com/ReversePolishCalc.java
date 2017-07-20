package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePolishCalc {

    private List<String> tokens = new ArrayList<>();
    private List<Double> stack = new ArrayList<>();

    public double calculate(String input) {
        tokens = Arrays.asList(input.split(","));
        for (String string : tokens) {

            double firstOperand, secondOperand, result;

            switch (string) {
                case "+":
                    firstOperand = stack.remove(stack.size() - 2);
                    secondOperand = stack.remove(stack.size() - 1);
                    result = firstOperand + secondOperand;
                    stack.add(result);
                    break;
                case "-":
                    firstOperand = stack.remove(stack.size() - 2);
                    secondOperand = stack.remove(stack.size() - 1);
                    result = firstOperand - secondOperand;
                    stack.add(result);
                    break;
                case "*":
                    firstOperand = stack.remove(stack.size() - 2);
                    secondOperand = stack.remove(stack.size() - 1);
                    result = firstOperand * secondOperand;
                    stack.add(result);
                    break;
                case "/":
                    firstOperand = stack.remove(stack.size() - 2);
                    secondOperand = stack.remove(stack.size() - 1);
                    result = firstOperand / secondOperand;
                    stack.add(result);
                    break;
                default:
                    stack.add(Double.parseDouble(string));
            }
        }


        return stack.remove(0);
    }
}

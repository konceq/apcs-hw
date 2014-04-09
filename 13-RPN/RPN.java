import java.util.Scanner;
import java.util.*;
import java.io.*;

public class rpn {
    private CalcStack stack = new CalcStack();
    public void push(String s) {
        double d = Double.parseDouble(s);
        stack.push(d);
    }

    public void add() {
        double result = 0;
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
        if (!stack.isEmpty()) {
            result += stack.pop();
        }
        stack.push(result);
    }

    public void subtract() {
        double result = 0;
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
        if (!stack.isEmpty()) {
            result = stack.pop() - result;
        }
        stack.push(result);
    }

    public void divide() {
        double result = 0;
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
        if (!stack.isEmpty()) {
            result = stack.pop() / result;
        }
        stack.push(result);
    }

    public void multiply() {
        double result = 0;
        if (!stack.isEmpty()) {
            result = stack.pop();
        }
        if (!stack.isEmpty()) {
            result *= stack.pop();
        }
        stack.push(result);
    }

    public double operation (String[] a) {
        for (String s : a) {
            if (s.equals("+")) {
                add();
            }
            else if (s.equals("-")) {
                subtract();
            }
            else if (s.equals("/")) {
                divide();
            }
            else if (s.equals("*")) {
                multiply();
            }

            else {
                push(s);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        rpn rpn1 = new rpn();
        Scanner scanStr = new Scanner(System.in);
        System.out.println("Expression :");
        String[] input = scanStr.nextLine().split(" ");
        System.out.println("Result: " + rpn.operation(input));
    }

}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Итоговое ДЗ 1. Калькулятор:\n ");
        int number = 10;
        int number2 = 5;
        int result;
        String sign = "+";

        if (sign.equals("+")) {
            result = number + number2;
        } else if (sign.equals("-")) {
            result = number - number2;
        } else if (sign.equals("*")) {
            result = number * number2;
        } else if (sign.equals("/")) {
            result = number / number2;
        } else if (sign.equals("%")) {
            result = number % number2;
        } else if (sign.equals("^")) {
            result = 1;
            for (int i = 0; i < number2; i++) {
                result *= number;
            }
        } else {
            result = 0;
        }
        System.out.println(number + " " + sign + " " + number2 + " = " + result);

          }
        }
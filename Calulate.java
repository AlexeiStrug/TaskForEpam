import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by SAV on 01.02.2017.
 */

/*
Задание:
1) позволять вводить данные с клавиатуры;
2) выполнять минимум 5 арифметических действий;
3) определять (или запрещать) наиболее очевидные ошибки ввода (например, попытка сложения букв вместо цифр);
4) выводить результаты действия;
5) Достаточно простого консольного приложения – наличие user interface не обязательно.
Помимо файла рабочего приложения (.exe, .class…) предоставить исходный код.
*/

public class Calulate {


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Calulate.inPut(in);
        in.close();
    }

    public static void inPut(BufferedReader in) throws Exception {
        boolean nextStep = true;
        do {
            try {
                System.out.println("Enter first number: ");
                double firstNumber = Double.parseDouble(in.readLine());

                System.out.println("Enter second number: ");
                double secondNumber = Double.parseDouble(in.readLine());

                System.out.println("Enter operation number \"+\",\"-\",\"*\",\"/\",\"^\": ");
                String whatOperation = in.readLine();

                Double resultOperation = Calulate.functionCalculate(firstNumber, whatOperation, secondNumber);

                if (resultOperation == null) {
                    System.out.println("Start again");
                    continue;
                }

                System.out.println("Result: " + firstNumber + " " + whatOperation + " " + secondNumber + " = " + resultOperation);
            } catch (Exception e) {
                System.out.print("Error value");
            }

            System.out.println("Do you have continue?");
            System.out.print("1 - Continue\t");
            System.out.println("2 - End");
            int whatDo = Integer.parseInt(in.readLine());

            if (whatDo == 2) nextStep = false;
        } while (nextStep);
    }

    public static Double functionCalculate(double number1, String operation, double number2) {

        double result;
        try {
            switch (operation) {
                case ("+"):
                    result = number1 + number2;
                    break;
                case ("-"):
                    result = number1 - number2;
                    break;
                case ("*"):
                    result = number1 * number2;
                    break;
                case ("/"):
                    result = number1 / number2;
                    break;
                case ("^"):
                    result = Math.pow(number1, number2);
                    break;
                default:
                    throw new IllegalArgumentException("Illegal operation");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
        return result;
    }
}

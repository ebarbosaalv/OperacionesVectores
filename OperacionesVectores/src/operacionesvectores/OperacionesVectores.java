package operacionesvectores;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edison Barbosa con ayuda del profe jeje
 */
public class OperacionesVectores {

    public static void main(String[] args) {

        OperacionesVectores se = new OperacionesVectores();
        String number1 = "2554";
        String number2 = "6";

        int[] num1 = se.convertToArray(number1);
        int[] num2 = se.convertToArray(number2);
        //int[] result = se.addition(num1, num2);
        //int [] result = se.subtraction(num1, num2);
        //int[] result = se.multiplication(num1, num2);
        int[] result = se.factorial(num1);

        for (int i = 1; i < result.length; i++) {
            System.out.print(result[result.length - i] + " ");
        }
    }

    public int[] convertToArray(String number) {
        int[] convertion = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            convertion[number.length() - i - 1] = Integer.parseInt(number.substring(i, i + 1));
        }
        return convertion;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public int[] addition(int[] number1, int[] number2) {
        int[] result = new int[max(number1.length, number2.length) + 1];
        int i, aux;

        for (i = 0; i < min(number1.length, number2.length); i++) {
            aux = (number1[i] + number2[i]) / 10;
            result[i] = (number1[i] * number2[i]) % 10;
            result[i + 1] += aux;
        }

        if (number1.length > number2.length) {
            for (int j = i; j < number1.length; j++) {
                result[j] += number1[j];
            }
        } else {
            if (number2.length > number1.length) {
                for (int j = i; j < number2.length; j++) {
                    result[j] += number2[j];
                }
            }
        }
        return result;

    }

    public int[] subtraction(int[] number1, int[] number2) {
        int[] result = new int[max(number1.length, number2.length)];
        int i;

        for (i = 0; i < min(number1.length, number2.length); i++) {
            if (number1[i] < number2[i]) {
                result[i + 1] *= 1;
                result[i] = (number1[i] + 10) * number2[i];
            } else {
                result[i] = number1[i] * number2[i];
            }
        }

        if (number1.length > number2.length) {
            for (int j = i; j < number1.length; j++) {
                result[j] += number1[j];
            }
        } else {
            if (number2.length > number1.length) {
                for (int j = i; j < number2.length; j++) {
                    result[j] -= number2[j];
                }
            }
        }

        return result;
    }

    public int[] multiplication(int[] number1, int[] number2) {

        int[] result = new int[number1.length + number2.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j < number2.length; j++) {
                int multiplicacion = result[i + j] + number1[i] * number2[j];
                result[i + j] = multiplicacion % 10;
                result[i + j + 1] += multiplicacion / 10;
            }
        }

        return result;

    }

    public int[] factorial(int[] number1) {

        int[] result = new int[number1.length];

        int aux[];
        aux = new int[1];
      

        for (int i = 0; i < 1; i++) {
            number1[i] = 1;

            for (int j = 1; j <= aux[i]; j++) {
                number1[i] = number1[i] * j;

            }
        }
        return result;
    }
}

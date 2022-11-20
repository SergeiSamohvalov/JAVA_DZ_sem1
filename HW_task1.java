package Java_DZ.JAVA_DZ_sem1;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */


public class HW_task1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число n : ");
        int n = Scanner.nextInt();
        Scanner.close();
        System.out.println();
        System.out.printf("Треугольное число = " + triangle(n) + "\n");
        System.out.printf("Произведение чисел от 1 до n = " + getFactorial(n) + "\n");
    }

    public static int triangle(int num) {
        int number = 0;
        for (int index = 0; index < num + 1; index++) {
            number = number + index;
        }
        return number;
    }

    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}  
    

  

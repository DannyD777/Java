package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Scanner name = new Scanner(System.in);
        System.out.println("Введите число");
        int a = name.nextInt();
        System.out.println("Введите действие (+, -, *, /, %)");
        char operation = name.next().charAt(0);
        System.out.println("Введите число");
        int b = name.nextInt();
        switch (operation){
            case '+':
                System.out.printf("Сумма a=%d and b=%d: %d \n" , a, b, a+b);
                break;
            case '-':
                System.out.printf("Сумма a=%d and b=%d: %d \n" , a, b, a-b);
                break;
            case '*':
                System.out.printf("Сумма a=%d and b=%d: %d \n" , a, b, a*b);
                break;
            case '/':
                System.out.printf("Сумма a=%d and b=%d: %d \n" , a, b, a/b);
                break;
            case '%':
                System.out.printf("Сумма a=%d and b=%d: %d \n" , a, b, a%b);
                break;
            default:
                System.out.printf("Ошибка");
        }






    }
}

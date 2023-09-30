package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator();
        Scanner name = new Scanner(System.in);
        while (true){
            input1();
            int a = name.nextInt();
            action();
            char operation = name.next().charAt(0);
            input1();
            int b = name.nextInt();

            switch (operation){
                case '+':
                    System.out.printf("Решение a=%d + b=%d: %d \n",a,b, a+b);
                    break;
                case '-':
                    System.out.printf("Решение a=%d - b=%d: %d \n",a,b, a-b);
                    break;
                case '*':
                    System.out.printf("Решение a=%d * b=%d: %d \n",a,b, a*b);
                    break;
                case '/':
                    System.out.printf("Решение a=%f / b=%f: %f \n",a,b,(double) a/b);
                    break;
                case '%':
                    System.out.printf("Решение a=%f and b=%f: %f \n",a,b,(double) a%b);
                    break;
                default:
                    System.out.println("Error");

            }





        }



    }
    static void calculator(){
        System.out.println("Calculator");
    }
    static void input1(){
        System.out.println("Введите число");
    }
    static void action(){
        System.out.println("Введите действие (+, -, *, /, %)");
    }



}

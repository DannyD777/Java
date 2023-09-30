package p4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator();
        Scanner name = new Scanner(System.in);
        while (true){
            input1();
            double a = name.nextDouble();
            action();
            char operation = name.next().charAt(0);
            input1();
            double b = name.nextDouble();

            switch (operation){
                case '+':
                    System.out.printf("Решение a=%f + b=%f: %f \n",a,b, a+b);
                    break;
                case '-':
                    System.out.printf("Решение a=%f - b=%f: %f \n",a,b, a-b);
                    break;
                case '*':
                    System.out.printf("Решение a=%f * b=%f: %f \n",a,b, a*b);
                    break;
                case '/':
                    System.out.printf("Решение a=%f / b=%f: %f \n",a,b, a/b);
                    break;
                case '%':
                    System.out.printf("Решение a=%f and b=%f: %f \n",a,b, a%b);
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


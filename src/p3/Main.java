package p3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        Random rnd = new Random();


        for (int i = 0; i< numbers.length; i++) {
            numbers[i] =rnd.nextInt( 101) -51;
            System.out.println(numbers[i] + ""); }
        // минимальное значение
         int minus = numbers[0];
         for( int i=0;i<numbers.length;i++){
             if (minus>numbers[i]){
                 minus=numbers[i];
             } }
         System.out.println();
         System.out.println( "Min is:" + minus);


       // максимальное значение
        int plus = numbers[0];
        for( int i=0;i<numbers.length;i++) {
            if (plus < numbers[i]) {
                plus = numbers[i];

            }

        }
        System.out.println();
        System.out.println( "Max is:" + plus);

        // среднее значение
        double average=0;
        for (int i=0;i<numbers.length;i++){
        average+=numbers[i]/numbers.length;

        }
        System.out.println();
        System.out.println("Average is:" + average);


   }






}
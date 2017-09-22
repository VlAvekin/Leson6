package com.gmail.vladaavekin;


// Напишите программу, которая будет выполнять конвертирование валют.
// Пользователь вводит: сумму денег в определенной валюте, курс для
// конвертации в другую валюту. Организуйте вывод результата операции
// конвертирования валюты на экран.

import java.util.Scanner;

public class Tasc2 {


    // Расчет валют
    // 1 - Перевод с курса в курс

    public static int currency = 0;
    public static double money = 0d;
    public static String[] val = {"ГРН", "USD", "EUR"};

    public static double USD = 26.08;
    public static double EUR = 30.92;


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("( ГРН = 1; USD = 2; EUR = 3 )");

        currency = scanner.nextInt();

        System.out.print("Сумма ");
        money = scanner.nextDouble();

        if (currency == 1){
            System.out.println("ГРН " + money);
            System.out.println("USD " + (money / USD) );
            System.out.println("EUR " + (money / EUR));
        } else if (currency == 2){
            System.out.println("ГРН " + (money / ( 1 / USD ) ) );
            System.out.println("USD " + (money) );
            System.out.println("EUR " + (money / (money / (money / ( 1 / USD ) ) * EUR)) );
        } else if (currency == 3){
            System.out.println("ГРН " + (money / ( 1 / EUR ) ));
            System.out.println("USD " + ( money / (money / (money / ( 1 / EUR ) ) * USD)));
            System.out.println("EUR " + money);
        }
    }

}

package com.gmail.vladaavekin;


// Напишите программу, которая будет выполнять конвертирование валют.
// Пользователь вводит: сумму денег в определенной валюте, курс для
// конвертации в другую валюту. Организуйте вывод результата операции
// конвертирования валюты на экран.

import java.util.Scanner;

public class Tasc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в грн: ");
        double out = scanner.nextDouble();
        System.out.print("Введите валюту (USD, EUR, RUB) :");
        int valute = scanner.nextInt();

        System.out.println(Sum(out, valute));

    }

    public static double Sum(double out, int valute){

        double USD = 26;
        double EUR = 30.7;
        double RUB = 0.45;

        if (valute == 1) out = out / USD;
        else if (valute == 2) out  = out / EUR;
        else if (valute == 3)  out = out / RUB;

        return out;
    }

}

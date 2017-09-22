package com.gmail.vladaavekin;

// Напишите метод, который будет определять:
//  1) является ли введенное число положительным или отрицательным.
//  2) Является ли оно простым (используйте технику перебора значений).
//     (Простое число — это натуральное число, которое делится на 1 и само на
//     себя. Чтобы определить простое число или нет, следует найти все его
//     целые делители. Если делителей больше 2-х, значит оно не простое.)
//   3) Делится ли на 2, 5, 3, 6, 9 без остатка.

// TODO: дописать

import java.util.Scanner;

public class Tasc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("является ли введенное число положительным или отрицательным.");
        System.out.print("Введите число: ");
        int out = scanner.nextInt();

        // 1
        if ((out >> 31) == 0) System.out.println("введенное число положительным!");
        else System.out.println("введенное число отрицательным!");

        // 2
        int num;
        boolean isPrime;

        num = out;

        if(num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {

            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Пpocтoe число");
        else System.out.println("He простое число");

        // 3
        System.out.println();


    }




}

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
        if ((out >> 31) == 0) System.out.print("введенное число положительным!");
        else System.out.print("введенное число отрицательным!");

        // 2
        System.out.println();
        for (int i = 1; i < out; i++) {
            if ((out >> 31) == 0) {

                if (i % 1 == 0) {
                    if (i % i == 0){
                        //System.out.println(i);
                    }
                }

            }
        }

        // 3
        System.out.println();
        for (int i = 0; i < out*out; i++) {

            if ((i % 2) == 0 && (i % 3) == 0 && (i % 5) == 0 && (i % 6) == 0 && (i % 9) == 0) {
                System.out.println(i);
            }

        }

    }




}

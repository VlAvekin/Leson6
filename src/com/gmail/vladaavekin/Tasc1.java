package com.gmail.vladaavekin;


// Представьте, что вы реализуете программу для банка, которая помогает
// определить, погасил ли клиент кредит или нет. Допустим, ежемесячная сумма
// платежа должна составлять 100 грн. Клиент должен выполнить 7 платежей, но
// может платить реже большими суммами. Т.е., может двумя платежами по 300
// и 400 грн. Закрыть весь долг. Создайте метод, который будет в качестве
// аргумента принимать сумму платежа, введенную экономистом банка. Метод
// выводит на экран информацию о состоянии кредита (сумма задолженности,
// сумма переплаты, сообщение об отсутствии долга).

// TODO: дописать проверку

import java.util.Scanner;

public class Tasc1 {

    static double sum;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        double pla = 100;
        int plate = 7;
        double dolg = pla * plate;

        System.out.println(Sum(plate, dolg));


    }

    private static double Sum(final int plate, final double dolg) {


        for (int i = 0; i < plate; i++) {
            System.out.format("Взнос %d: ", i+1);
            double a = scanner.nextDouble();
            sum += a;

            if (sum == dolg) {
                sum += a;
                return sum;
            }
        }
        return sum;
    }

}

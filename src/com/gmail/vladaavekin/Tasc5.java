package com.gmail.vladaavekin;


//  Напишите метод, который принимает 2 аргумента : целочисленный массив, и
// целочисленное число. В методе организуйте проверку, содержит ли массив это
// число. Метод должен возвращать логическое значение (true – содержит, false –
// не содержит). Создайте перегрузку этого метода, который в качестве первого
// аргумента принимает массив элементов типа double, а в качестве второго
// аргумента принимает аргумент типа double .

import com.gmail.vladaavekin.iTasc4.PrintArray;

public class Tasc5 {

    public static void main(String[] args) {

        int Array[] = {1, 2, 5, 9, 8, 5, 6, 9, 7, 36, 0};
        PrintArray.Array(Array);
        System.out.println("9 " + Res(Array, 9));

        double dArray[] = {1, 2.3, 5.7, 9, 8.3, 5, 6, 9.2, 7, 3.6, 0};
        PrintArray.Array(dArray);
        System.out.println("8.3 " + Res(dArray, 8.3));

    }

    private static boolean Res(int Array[], int nam){

        boolean res = false;

        for (int i = 0; i < Array.length; i++) {

            if (nam == Array[i]) {
                res = true;
                break;
            }
            else res = false;
        }
        return res;
    }

    private static boolean Res(double Array[], double nam){

        boolean res = false;

        for (int i = 0; i < Array.length; i++) {

            if (nam == Array[i]) {
                res = true;
                break;
            }
            else res = false;
        }
        return res;
    }
}

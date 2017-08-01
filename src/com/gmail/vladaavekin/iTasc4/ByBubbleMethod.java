package com.gmail.vladaavekin.iTasc4;

public class ByBubbleMethod {

    public static int[] BubbleSortForMaxToMin(int[] num) {
        int j = 0;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return num;
    }

    // Сортировка пузырьком - от меньшего к большему
    public static int[] BubbleSortForMinToMax(int[] num) {
        int j = 0;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return num;
    }

}

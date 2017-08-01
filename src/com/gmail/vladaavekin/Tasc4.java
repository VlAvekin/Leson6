package com.gmail.vladaavekin;


//  Напишите метод, который в качестве аргумента принимает одномерный
// целочисленный массив, и сортирует его “Методом пузырька”. Также
// напишите отдельный метод, для вывода массива на экран.

import com.gmail.vladaavekin.iTasc4.ByBubbleMethod;
import com.gmail.vladaavekin.iTasc4.PrintArray;

public class Tasc4 {

    public static void main(String[] args) {

        int Array[] = {0, 5, 8, 4, 6, 8, 2, 7, 3, -5};

        ByBubbleMethod.BubbleSortForMinToMax(Array);

        PrintArray.Array(Array);

    }

}
